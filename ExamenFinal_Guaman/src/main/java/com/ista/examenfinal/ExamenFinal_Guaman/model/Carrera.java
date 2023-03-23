package com.ista.examenfinal.ExamenFinal_Guaman.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carrera")
@Getter
@Setter
public class Carrera {

    @Id
    private String id_carrera;
    private String nombre;
    private String descripcion;



}
