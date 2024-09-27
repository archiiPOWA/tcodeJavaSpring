package com.api.restaurant;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Plato {
    private int num;
    private String nombre;
    private Double precio;
    private String descripcion;

    public Plato(int num, String nombre, Double precio, String descripcion){
        this.num=num;
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        }
        public Plato(){
        }

}
