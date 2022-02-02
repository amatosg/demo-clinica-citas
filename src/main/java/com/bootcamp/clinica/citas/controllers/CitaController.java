package com.bootcamp.clinica.citas.controllers;

import com.bootcamp.clinica.citas.entities.Cita;
import com.bootcamp.clinica.citas.entities.Diagnostico;
import com.bootcamp.clinica.citas.services.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("citas")
public class CitaController {

  @Autowired
  private CitaService citaService;


  @GetMapping
  public List<Cita> findAll() {
    return this.citaService.findAll();
  }

  @GetMapping("/{id}")
  public Cita findById(@PathVariable Long id) {
    return this.citaService.findById(id);
  }


  @PostMapping
  public Cita save(@RequestBody Cita doctor) {
    return this.citaService.save(doctor);
  }

  @PutMapping("/{id}")
  public Cita atiendeCita(@PathVariable Long id, @RequestBody Diagnostico diagnostico) {
    return this.citaService.atiendeCita(id, diagnostico);
  }

}
