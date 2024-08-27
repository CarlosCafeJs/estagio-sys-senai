package com.example.estagiosenai.estagiosys.models;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estagiarios_vagas")
public class EstagiarioVaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstagiariovg;
    
    private int qtdEstagiariosvg;
    private LocalTime horaEstagiovg;
    private String cursoEstagiovg;
    private String modalidadeEstagiovg;
    private int semestrevg;
    private String atividadesEstagiovg;

    // Getter e Setter para id
    public Long getIdEstagiariovg() {
        return idEstagiariovg;
    }

    public void setIdEstagiariovg(Long idEstagiariovg) {
        this.idEstagiariovg = idEstagiariovg;
    }

    // Getter e Setter para quantidadeEstagiarios
    public int getQtdEstagiariosvg() {
        return qtdEstagiariosvg;
    }

    public void setQtdEstagiariosvg(int qtdEstagiariosvg) {
        this.qtdEstagiariosvg = qtdEstagiariosvg;
    }

    // Getter e Setter para horaEstagio
    public LocalTime getHoraEstagiovg() {
        return horaEstagiovg;
    }

    public void setHoraEstagiovg(LocalTime horaEstagiovg) {
        this.horaEstagiovg = horaEstagiovg;
    }

    // Getter e Setter para cursoEstagio
    public String getCursoEstagiovg() {
        return cursoEstagiovg;
    }

    public void setCursoEstagiovg(String cursoEstagiovg) {
        this.cursoEstagiovg = cursoEstagiovg;
    }

    // Getter e Setter para modalidadeEstagio
    public String getModalidadeEstagiovg() {
        return modalidadeEstagiovg;
    }

    public void setModalidadeEstagiovg(String modalidadeEstagiovg) {
        this.modalidadeEstagiovg = modalidadeEstagiovg;
    }

    // Getter e Setter para semestre
    public int getSemestrevg() {
        return semestrevg;
    }

    public void setSemestrevg(int semestrevg) {
        this.semestrevg = semestrevg;
    }

    // Getter e Setter para atividadesEstagio
    public String getAtividadesEstagiovg() {
        return atividadesEstagiovg;
    }

    public void setAtividadesEstagiovg(String atividadesEstagiovg) {
        this.atividadesEstagiovg = atividadesEstagiovg;
    }
}
