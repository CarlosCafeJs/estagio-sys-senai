package com.example.estagiosenai.estagiosys.models;

import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estagiarios_vagas")
public class EstagiarioVaga {

    @Id
    private Long id;

    private int quantidadeEstagiarios;
    private LocalTime horaEstagio;
    private String cursoEstagio;
    private String modalidadeEstagio;
    private int semestre;
    private String atividadesEstagio;

    // Getter e Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter e Setter para quantidadeEstagiarios
    public int getQuantidadeEstagiarios() {
        return quantidadeEstagiarios;
    }

    public void setQuantidadeEstagiarios(int quantidadeEstagiarios) {
        this.quantidadeEstagiarios = quantidadeEstagiarios;
    }

    // Getter e Setter para horaEstagio
    public LocalTime getHoraEstagio() {
        return horaEstagio;
    }

    public void setHoraEstagio(LocalTime horaEstagio) {
        this.horaEstagio = horaEstagio;
    }

    // Getter e Setter para cursoEstagio
    public String getCursoEstagio() {
        return cursoEstagio;
    }

    public void setCursoEstagio(String cursoEstagio) {
        this.cursoEstagio = cursoEstagio;
    }

    // Getter e Setter para modalidadeEstagio
    public String getModalidadeEstagio() {
        return modalidadeEstagio;
    }

    public void setModalidadeEstagio(String modalidadeEstagio) {
        this.modalidadeEstagio = modalidadeEstagio;
    }

    // Getter e Setter para semestre
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Getter e Setter para atividadesEstagio
    public String getAtividadesEstagio() {
        return atividadesEstagio;
    }

    public void setAtividadesEstagio(String atividadesEstagio) {
        this.atividadesEstagio = atividadesEstagio;
    }
}
