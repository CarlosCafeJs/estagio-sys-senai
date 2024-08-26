package com.example.estagiosenai.estagiosys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "supervisores_vagas")
public class SupervisorVaga {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idSupervidorvg;

  private String cpfSupervisorvg;

  private String nomeSupervisorvg;
  private String formacaoSupervisorvg;
  private boolean processoSeletivoResponsavelvg;
  private String nomeRecrutadorvg;

  // Getter e Setter para cpfSupervisorvg
  public String getCpfSupervisorvg() {
    return cpfSupervisorvg;
  }

  public void setCpfSupervisorvg(String cpfSupervisorvg) {
    this.cpfSupervisorvg = cpfSupervisorvg;
  }

  // Getter e Setter para nomeSupervisorvg
  public String getNomeSupervisorvg() {
    return nomeSupervisorvg;
  }

  public void setNomeSupervisorvg(String nomeSupervisorvg) {
    this.nomeSupervisorvg = nomeSupervisorvg;
  }

  // Getter e Setter para formacaoSupervisorvg
  public String getFormacaoSupervisorvg() {
    return formacaoSupervisorvg;
  }

  public void setFormacaoSupervisorvg(String formacaoSupervisorvg) {
    this.formacaoSupervisorvg = formacaoSupervisorvg;
  }

  // Getter e Setter para processoSeletivoResponsavelvg
  public boolean isProcessoSeletivoResponsavelvg() {
    return processoSeletivoResponsavelvg;
  }

  public void setProcessoSeletivoResponsavelvg(boolean processoSeletivoResponsavelvg) {
    this.processoSeletivoResponsavelvg = processoSeletivoResponsavelvg;
  }

  // Getter e Setter para nomeRecrutadorvg
  public String getNomeRecrutadorvg() {
    return nomeRecrutadorvg;
  }

  public void setNomeRecrutadorvg(String nomeRecrutadorvg) {
    this.nomeRecrutadorvg = nomeRecrutadorvg;
  }

  public Long getIdSupervidorvg() {
    return idSupervidorvg;
  }

  public void setIdSupervidorvg(Long idSupervidorvg) {
    this.idSupervidorvg = idSupervidorvg;
  }
}
