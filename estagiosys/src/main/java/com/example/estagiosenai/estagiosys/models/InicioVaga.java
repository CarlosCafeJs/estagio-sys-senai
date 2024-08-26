package com.example.estagiosenai.estagiosys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inicios_vagas")
public class InicioVaga {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idIniciovg;
  
  private String regionalIniciovg;
  private String diretoriaIniciovg;
  private String superintendenciaIniciovg;
  private String descricaoIniciovg;

  // Getter para idIniciovg
  public Long getIdIniciovg() {
    return idIniciovg;
  }

  // Setter para idIniciovg
  public void setIdIniciovg(Long idIniciovg) {
    this.idIniciovg = idIniciovg;
  }

  // Getter para regionalIniciovg
  public String getRegionalIniciovg() {
    return regionalIniciovg;
  }

  // Setter para regionalIniciovg
  public void setRegionalIniciovg(String regionalIniciovg) {
    this.regionalIniciovg = regionalIniciovg;
  }

  // Getter para diretoriaIniciovg
  public String getDiretoriaIniciovg() {
    return diretoriaIniciovg;
  }

  // Setter para diretoriaIniciovg
  public void setDiretoriaIniciovg(String diretoriaIniciovg) {
    this.diretoriaIniciovg = diretoriaIniciovg;
  }

  // Getter para superintendenciaIniciovg
  public String getSuperintendenciaIniciovg() {
    return superintendenciaIniciovg;
  }

  // Setter para superintendenciaIniciovg
  public void setSuperintendenciaIniciovg(String superintendenciaIniciovg) {
    this.superintendenciaIniciovg = superintendenciaIniciovg;
  }

  // Getter para descricaoIniciovg
  public String getDescricaoIniciovg() {
    return descricaoIniciovg;
  }

  // Setter para descricaoIniciovg
  public void setDescricaoIniciovg(String descricaoIniciovg) {
    this.descricaoIniciovg = descricaoIniciovg;
  }
}
