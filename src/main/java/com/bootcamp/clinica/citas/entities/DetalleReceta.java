package com.bootcamp.clinica.citas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleReceta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  @Column(unique = true , nullable = false)
  private Long id;

  @Column
  private String producto;

  @Column
  private String indicaciones;

  @Column
  private int cantidad;

  @ManyToOne()
  @JoinColumn(name = "receta_id")
  private Receta receta;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public String getIndicaciones() {
    return indicaciones;
  }

  public void setIndicaciones(String indicaciones) {
    this.indicaciones = indicaciones;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public Receta getReceta() {
    return receta;
  }

  public void setReceta(Receta receta) {
    this.receta = receta;
  }
}
