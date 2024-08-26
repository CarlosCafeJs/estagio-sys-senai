package com.example.estagiosenai.estagiosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.estagiosenai.estagiosys.models.EstagiarioVaga;
import com.example.estagiosenai.estagiosys.models.InicioVaga;
import com.example.estagiosenai.estagiosys.models.SupervisorVaga;

@RestController
public class Controller {

  @GetMapping("/")
  public String mensagem() {
    return "teste";
  }

  // Endpoint para o supervisor
  @PostMapping("/api/supervisor")
  public SupervisorVaga criarSupervisorVaga(@RequestBody SupervisorVaga supervisorVaga) {
    // Aqui você pode adicionar lógica para salvar o supervisorVaga no banco de
    // dados
    return supervisorVaga;
  }

  // Endpoint para a vaga de estágio
  @PostMapping("/api/estagiario")
  public EstagiarioVaga criarEstagiarioVaga(@RequestBody EstagiarioVaga estagiarioVaga) {
    // Aqui você pode adicionar lógica para salvar o estagiarioVaga no banco de
    // dados
    return estagiarioVaga;
  }

  // Endpoint para o início da vaga
  @PostMapping("/api/inicio")
  public InicioVaga criarInicioVaga(@RequestBody InicioVaga inicioVaga) {
    // Aqui você pode adicionar lógica para salvar o inicioVaga no banco de dados
    return inicioVaga;
  }
}
