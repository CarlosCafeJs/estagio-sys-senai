package com.example.estagiosenai.estagiosys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estagiosenai.estagiosys.models.InicioVaga;
import com.example.estagiosenai.estagiosys.service.InicioService;

@RestController
@RequestMapping("/api/inicio")
public class InicioController {

  private InicioService serviceIncio;

  public InicioController(InicioService serviceIncio) {
    this.serviceIncio = serviceIncio;
  }

  @PostMapping
  public List<InicioVaga> create(@RequestBody InicioVaga vagaInicio) {
    return serviceIncio.create(vagaInicio);
  }

  @GetMapping
  public List<InicioVaga> list() {
    return serviceIncio.list();
  }

  @PutMapping
  public List<InicioVaga> update(@RequestBody InicioVaga vagaInicio) {
    return serviceIncio.update(vagaInicio);
  }

  @DeleteMapping("{idIniciovg}")
  public List<InicioVaga> delete(@PathVariable Long idIniciovg) {
    return serviceIncio.delete(idIniciovg);
  }

}