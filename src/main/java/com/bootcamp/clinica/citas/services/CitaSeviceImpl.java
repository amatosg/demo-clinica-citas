package com.bootcamp.clinica.citas.services;

import com.bootcamp.clinica.citas.entities.Cita;
import com.bootcamp.clinica.citas.entities.Diagnostico;
import com.bootcamp.clinica.citas.repositories.CitaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaSeviceImpl implements CitaService {

  @Autowired
  private CitaRepository citaRepository;

  @Override
  public List<Cita> findAll() {
    return this.citaRepository.findAll();
  }

  @Override
  public Cita save(Cita cita) {
    if (cita.getId() == null) {
      cita.setEstado("Programado");
    }
    return this.citaRepository.save(cita);
  }

  @Override
  public Cita findById(Long id) {
    return this.citaRepository.findById(id).get();
  }

  @Override
  public Cita atiendeCita(Long id, Diagnostico diagnostico) {
    var cita = this.findById(id);
    cita.setEstado("atendida");
    cita.setDiagnostico(diagnostico.getDetalle());
    return cita;
  }
}
