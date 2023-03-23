package com.ista.examenfinal.ExamenFinal_Guaman.repository;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Carrera;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarreraRepositoty extends MongoRepository<Carrera, String> {
}
