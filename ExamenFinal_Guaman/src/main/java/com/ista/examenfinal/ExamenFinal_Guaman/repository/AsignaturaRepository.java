package com.ista.examenfinal.ExamenFinal_Guaman.repository;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepository extends MongoRepository<Asignatura, String> {
}
