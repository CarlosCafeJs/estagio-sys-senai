package com.example.estagiosenai.estagiosys.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.estagiosenai.estagiosys.models.InicioVaga;
import com.example.estagiosenai.estagiosys.repository.RepositoryInicio;

@Service
public class InicioService {


  private RepositoryInicio repositoryInicio;

  public InicioService(RepositoryInicio repositoryInicio) {
    this.repositoryInicio = repositoryInicio;
  }

  public List<InicioVaga> create(InicioVaga vagaInicio) {
    repositoryInicio.save(vagaInicio);
    return list();

  }

  public List<InicioVaga> list() {
    Sort listaInicioVagas = Sort.by("idIniciovg").ascending();
    return repositoryInicio.findAll(listaInicioVagas);

  }

  public List<InicioVaga> update(InicioVaga vagaInicio) {
    repositoryInicio.save(vagaInicio);
    return list();
  }

  public List<InicioVaga> delete(Long idIniciovg) {
    repositoryInicio.deleteById(idIniciovg);
    return list();
  }

}
