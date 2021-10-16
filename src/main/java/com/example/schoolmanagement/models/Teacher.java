package com.example.schoolmanagement.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Teacher {

    @Getter @Setter
    private String usuario;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String semestre;
    @Getter @Setter
    private String carrera;
    @Getter @Setter
    private List<Student> estudiantesAsignados ;
    @Getter @Setter
    private List<MateriaS> materiasQueEnseña;

    public Teacher(String usuario, String password, String semestre, String carrera, List<Student> estudiantesAsignados, List<MateriaS> materiasQueEnseña) {
        this.usuario = usuario;
        this.password = password;
        this.semestre = semestre;
        this.carrera = carrera;
        this.estudiantesAsignados = estudiantesAsignados;
        this.materiasQueEnseña = materiasQueEnseña;
    }
}
