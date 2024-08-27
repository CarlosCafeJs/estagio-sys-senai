package com.example.estagiosenai.estagiosys.service;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.estagiosenai.estagiosys.repository.RepositorySupervisor;
import com.example.estagiosenai.estagiosys.models.SupervisorVaga;

@Service
public class SupervisorService {

  private RepositorySupervisor repositorySupervisor;

  public SupervisorService(RepositorySupervisor repositorySupervisor) {
    this.repositorySupervisor = repositorySupervisor;
  }

  public List<SupervisorVaga> create(SupervisorVaga vagaSupervisor) {
    repositorySupervisor.save(vagaSupervisor);
    return list();
  }

  public List<SupervisorVaga> list() {
    Sort listaSupervisorVaga = Sort.by("idSupervidorvg").ascending();
    return repositorySupervisor.findAll(listaSupervisorVaga);
  }

  public List<SupervisorVaga> update(SupervisorVaga vagaSupervisor) {
    repositorySupervisor.save(vagaSupervisor);
    return list();
  }

  public List<SupervisorVaga> delete(Long idSupervisorvg) {
    repositorySupervisor.deleteById(idSupervisorvg);
    return list();
  }

}
