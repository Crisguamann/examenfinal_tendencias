package com.ista.examenfinal.ExamenFinal_Guaman.repository;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends MongoRepository<Profesor, String> {

}
