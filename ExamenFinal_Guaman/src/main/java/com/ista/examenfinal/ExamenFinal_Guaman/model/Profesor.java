package com.ista.examenfinal.ExamenFinal_Guaman.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profesor")
@Getter
@Setter
public class Profesor {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

}
