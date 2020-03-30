package com.example.food;

import java.util.List;

public class ListaSandwiches {
    private String nombre;
    private int id;
    private String descripcion;
    private String precio;

    public ListaSandwiches(String nombre, int id, String descripcion, String precio) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ListaSandwiches(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return nombre;
    }
}


