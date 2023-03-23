package com.ista.examenfinal.ExamenFinal_Guaman.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "asignatura")
@Getter
@Setter
public class Asignatura {

    @Id
    private String id_asignatura;
    private String nombre;
    private int n_horas;
    private int n_horas_pracicas;
    private int n_horas_autonomas;

    @DBRef
    @Field("profesores")
    private List<Profesor> profesores;


}
