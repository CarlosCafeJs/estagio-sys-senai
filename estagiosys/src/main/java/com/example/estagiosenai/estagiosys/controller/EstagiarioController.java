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

import com.example.estagiosenai.estagiosys.models.EstagiarioVaga;
import com.example.estagiosenai.estagiosys.service.EstagiarioService;

@RestController
@RequestMapping("/api/estagiario")
public class EstagiarioController {

  private EstagiarioService serviceEstagiario;

  public EstagiarioController(EstagiarioService serviceEstagiario) {
    this.serviceEstagiario = serviceEstagiario;
  }

  @PostMapping
  public List<EstagiarioVaga> create(@RequestBody EstagiarioVaga vagaEstagiario) {
    return serviceEstagiario.create(vagaEstagiario);

  }

  @GetMapping
  public List<EstagiarioVaga> list() {
    return serviceEstagiario.list();
  }

  @PutMapping
  public List<EstagiarioVaga> update(@RequestBody EstagiarioVaga vagaEstagiario) {
    return serviceEstagiario.update(vagaEstagiario);
  }

  @DeleteMapping("/{idEstagiariovg}")
  public List<EstagiarioVaga> delete(@PathVariable Long idEstagiariovg) {
    return serviceEstagiario.delete(idEstagiariovg);
  }

}
