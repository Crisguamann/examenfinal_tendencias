package com.ista.examenfinal.ExamenFinal_Guaman.service;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Profesor;
import com.ista.examenfinal.ExamenFinal_Guaman.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, String> implements ProfesorService {
    @Autowired
    ProfesorRepository profesorRepositoryRepository;

    @Override
    public CrudRepository<Profesor, String> getDao() {
        // TODO Auto-generated method stub
        return profesorRepositoryRepository;
    }
}
