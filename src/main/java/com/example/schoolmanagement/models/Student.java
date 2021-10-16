package com.example.schoolmanagement.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Student {

    @Getter @Setter
    private String usuario;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String semestre;
    @Getter @Setter
    private String carrera;
    @Getter @Setter
    private List<MateriaS> materiasCursadas;
    @Getter @Setter
    private List<MateriaS> materiasPendientes;
    @Getter @Setter
    private List<MateriaS> pensum;

    public Student(String usuario, String password, String semestre,
                   String carrera, List<MateriaS> materiasCursadas, List<MateriaS> materiasPendientes,
                   List<MateriaS> pensum) {
        this.usuario = usuario;
        this.password = password;
        this.semestre = semestre;
        this.carrera = carrera;
        this.materiasCursadas = materiasCursadas;
        this.materiasPendientes = materiasPendientes;
        this.pensum = pensum;
    }
}
