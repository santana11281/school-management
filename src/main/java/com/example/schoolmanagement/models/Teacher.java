package com.example.schoolmanagement.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Teacher {

    @Getter @Setter
    private String usuario;
    private String password;
    @Getter @Setter
    private String semestre;
    @Getter @Setter
    private String carrera;
    @Getter @Setter
    private List<Student> estudiantesAsignados ;
    @Getter @Setter
    private List<Materia> materiasQueEnseña;



}
