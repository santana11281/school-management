package com.example.schoolmanagement.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MateriaS {
    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private List<String> notas;

    public MateriaS(String nombre, List<String> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
}
