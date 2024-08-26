package com.example.estagiosenai.estagiosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.estagiosenai.estagiosys.models.EstagiarioVaga;
import com.example.estagiosenai.estagiosys.models.InicioVaga;
import com.example.estagiosenai.estagiosys.models.SupervisorVaga;

@RestController
public class Controller {

  @Autowired
  private InicioVaga propsInicio;
  @Autowired
  private EstagiarioVaga propsSupervisor;
  @Autowired
  private SupervisorVaga propsEstagiario;

  @GetMapping("/")
  public String mensagem() {
    return "doc";
  }

  // Endpoint para o início da vaga
  @PostMapping("/api/inicio")
  public InicioVaga criarInicioVaga(@RequestBody InicioVaga inicioVaga) {
    return inicioVaga;
  }

  // Endpoint para o supervisor
  @PostMapping("/api/supervisor")
  public SupervisorVaga criarSupervisorVaga(@RequestBody SupervisorVaga supervisorVaga) {
    return supervisorVaga;
  }

  // Endpoint para a vaga de estágio
  @PostMapping("/api/estagiario")
  public EstagiarioVaga criarEstagiarioVaga(@RequestBody EstagiarioVaga estagiarioVaga) {
    return estagiarioVaga;
  }

}
