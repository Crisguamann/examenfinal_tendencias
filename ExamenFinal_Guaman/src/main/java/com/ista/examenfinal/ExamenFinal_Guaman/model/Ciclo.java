package com.ista.examenfinal.ExamenFinal_Guaman.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ciclo")
@Getter
@Setter
public class Ciclo {

    @Id
    private String id_ciclo;
    private String nombre;
    private String descripcion;

}
