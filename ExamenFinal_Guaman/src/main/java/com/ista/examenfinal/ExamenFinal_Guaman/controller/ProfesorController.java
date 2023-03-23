package com.ista.examenfinal.ExamenFinal_Guaman.controller;

import com.ista.examenfinal.ExamenFinal_Guaman.model.Profesor;
import com.ista.examenfinal.ExamenFinal_Guaman.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/getAll")
    public List<Profesor> getAll() {
        return profesorService.findByAll();
    }

    @PostMapping("/create")
    public Profesor create(@RequestBody Profesor restaurante) {
        return profesorService.save(restaurante);
    }

    @GetMapping("/getById/{id}")
    public Profesor getById(@PathVariable String id) {
        return profesorService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Profesor update(@PathVariable String id, @RequestBody Profesor profesor) {
        Profesor r = profesorService.findById(id);
        if (r == null) {
            return null;
        }else{
            r.setNombre(profesor.getNombre());
            r.setApellido(profesor.getApellido());
            r.setCorreo(profesor.getCorreo());
            r.setDireccion(profesor.getDireccion());
            r.setCelular(profesor.getCelular());
            return r;
        }

    }


}
