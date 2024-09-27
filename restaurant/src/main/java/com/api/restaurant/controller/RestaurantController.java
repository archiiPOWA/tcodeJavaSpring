package com.api.restaurant.controller;
import com.api.restaurant.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/platos/{num_plato}")
    @ResponseBody
    public Plato traerPlatos(@PathVariable int num_plato){
        List<Plato> listaPlatos = new ArrayList<---->();
        //simulo  la logica a la BD para traer elementos a la lista
        listaPlatos.add(new Plato(1,"milanesa con pure", 20, "carne de lomo rebozada con papas rusticas"));
        listaPlatos.add(new Plato(2, "fideos con tuco", 15, "fedio de harina integral con salsa de tomate y carne picada"));
        listaPlatos.add( new Plato(3, "arroz con pollo", 20, "medio pollo horneado acompañado con arroz, papas y salsa de la casa"));
        listaPlatos.add(new Plato(4, "pizza fugazza", 15, "pizza con abundante cebolla sofrita al rescoldo"));
    //busco en la lista de platos a ver si hay uno con esa id
        for (Plato plat: listaPlatos){
            if (plat.getNum() == num_plato){
                //si enceuntra plato completo lo muestra
                return plat;
            }
        }
        //sino encuentra devuelve null
        return null;
   }
}
