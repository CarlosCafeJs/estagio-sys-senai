package com.example.estagiosenai.estagiosys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inicios_vagas")
public class InicioVaga {

  @Id
  private Long id;

  private String regionalVaga;
  private String diretoriaVaga;
  private String superintendenciaVaga;
  private String descricaoVaga;

  // Getter para id
  public Long getId() {
    return id;
  }

  // Setter para id
  public void setId(Long id) {
    this.id = id;
  }

  // Getter para regionalVaga
  public String getRegionalVaga() {
    return regionalVaga;
  }

  // Setter para regionalVaga
  public void setRegionalVaga(String regionalVaga) {
    this.regionalVaga = regionalVaga;
  }

  // Getter para diretoriaVaga
  public String getDiretoriaVaga() {
    return diretoriaVaga;
  }

  // Setter para diretoriaVaga
  public void setDiretoriaVaga(String diretoriaVaga) {
    this.diretoriaVaga = diretoriaVaga;
  }

  // Getter para superintendenciaVaga
  public String getSuperintendenciaVaga() {
    return superintendenciaVaga;
  }

  // Setter para superintendenciaVaga
  public void setSuperintendenciaVaga(String superintendenciaVaga) {
    this.superintendenciaVaga = superintendenciaVaga;
  }

  // Getter para descricaoVaga
  public String getDescricaoVaga() {
    return descricaoVaga;
  }

  // Setter para descricaoVaga
  public void setDescricaoVaga(String descricaoVaga) {
    this.descricaoVaga = descricaoVaga;
  }
}
