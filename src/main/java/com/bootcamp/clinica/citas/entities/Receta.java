package com.bootcamp.clinica.citas.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Receta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  @Column(unique = true , nullable = false)
  private Long id;

  @ManyToOne()
  @JoinColumn(name = "doctor_id")
  private Doctor doctor;

  @ManyToOne()
  @JoinColumn(name = "paciente_id")
  private Paciente paciente;

  @Column(name = "fechahora")
  private Date fechaHora;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Date getFechaHora() {
    return fechaHora;
  }

  public void setFechaHora(Date fechaHora) {
    this.fechaHora = fechaHora;
  }


}
