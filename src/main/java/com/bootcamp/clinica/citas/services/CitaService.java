package com.bootcamp.clinica.citas.services;

import com.bootcamp.clinica.citas.entities.Cita;
import com.bootcamp.clinica.citas.entities.Diagnostico;
import java.util.List;

public interface CitaService {

  List<Cita> findAll();

  Cita save(Cita cita);

  Cita findById(Long id);

  Cita atiendeCita(Long id, Diagnostico diagnostico);
}
