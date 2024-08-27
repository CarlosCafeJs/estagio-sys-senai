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

import com.example.estagiosenai.estagiosys.models.SupervisorVaga;
import com.example.estagiosenai.estagiosys.service.SupervisorService;

@RequestMapping("/api/supervisor")
@RestController
public class SupervisorController {

  private SupervisorService serviceSupervisor;

  public SupervisorController(SupervisorService serviceSupervisor) {
    this.serviceSupervisor = serviceSupervisor;
  }

  @PostMapping
  public List<SupervisorVaga> create(@RequestBody SupervisorVaga vagaSupervisor) {
    return serviceSupervisor.create(vagaSupervisor);
  }

  @GetMapping
  public List<SupervisorVaga> list() {
    return serviceSupervisor.list();
  }

  @PutMapping
  public List<SupervisorVaga> update(@RequestBody SupervisorVaga vagaSupervisor) {
    return serviceSupervisor.update(vagaSupervisor);
  }

  @DeleteMapping("/{idSupervidorvg}")
  public List<SupervisorVaga> delete(@PathVariable Long idSupervidorvg) {
    return serviceSupervisor.delete(idSupervidorvg);
  }
}
