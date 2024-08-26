package com.example.estagioserpro.estagiosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/home")
  public String mensagem() {
    return "Hello World!";
  }

  @GetMapping("/{nome}")
  public String mensagemTeste(@PathVariable String nome) {
    return "Olá, Seja Bem Vindo (A) " + nome + "!";
  }

}
