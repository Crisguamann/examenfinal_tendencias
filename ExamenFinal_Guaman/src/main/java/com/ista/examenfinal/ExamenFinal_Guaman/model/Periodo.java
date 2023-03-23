package com.ista.examenfinal.ExamenFinal_Guaman.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "periodo")
@Getter
@Setter
public class Periodo {
    @Id
    private String id_periodo;
    private String periodo;
    private int year;

}
