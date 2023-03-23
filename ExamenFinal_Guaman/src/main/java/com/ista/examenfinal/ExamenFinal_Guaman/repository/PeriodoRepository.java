package com.ista.examenfinal.ExamenFinal_Guaman.repository;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeriodoRepository extends MongoRepository<Periodo, String> {
}
