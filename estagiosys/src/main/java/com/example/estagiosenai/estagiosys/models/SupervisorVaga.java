package com.example.estagiosenai.estagiosys.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "supervisores_vagas")
public class SupervisorVaga {

  @Id
  private String cpfSupervisor;

  private String nomeSupervisor;
  private String formacaoSupervisor;
  private boolean processoSeletivoResponsavel;
  private String nomeRecrutador;

  // Getter e Setter para cpfSupervisor
  public String getCpfSupervisor() {
    return cpfSupervisor;
  }

  public void setCpfSupervisor(String cpfSupervisor) {
    this.cpfSupervisor = cpfSupervisor;
  }

  // Getter e Setter para nomeSupervisor
  public String getNomeSupervisor() {
    return nomeSupervisor;
  }

  public void setNomeSupervisor(String nomeSupervisor) {
    this.nomeSupervisor = nomeSupervisor;
  }

  // Getter e Setter para formacaoSupervisor
  public String getFormacaoSupervisor() {
    return formacaoSupervisor;
  }

  public void setFormacaoSupervisor(String formacaoSupervisor) {
    this.formacaoSupervisor = formacaoSupervisor;
  }

  // Getter e Setter para processoSeletivoResponsavel
  public boolean isProcessoSeletivoResponsavel() {
    return processoSeletivoResponsavel;
  }

  public void setProcessoSeletivoResponsavel(boolean processoSeletivoResponsavel) {
    this.processoSeletivoResponsavel = processoSeletivoResponsavel;
  }

  // Getter e Setter para nomeRecrutador
  public String getNomeRecrutador() {
    return nomeRecrutador;
  }

  public void setNomeRecrutador(String nomeRecrutador) {
    this.nomeRecrutador = nomeRecrutador;
  }
}
