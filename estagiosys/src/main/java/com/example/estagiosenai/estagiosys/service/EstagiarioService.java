package com.example.estagiosenai.estagiosys.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.estagiosenai.estagiosys.models.EstagiarioVaga;
import com.example.estagiosenai.estagiosys.repository.RepositoryEstagiario;

@Service
public class EstagiarioService {

    private RepositoryEstagiario repositoryEstagiario;

    public EstagiarioService(RepositoryEstagiario repositoryEstagiario) {
        this.repositoryEstagiario = repositoryEstagiario;
    }

    public List<EstagiarioVaga> create(EstagiarioVaga vagaEstagiario) {
        repositoryEstagiario.save(vagaEstagiario);
        return list();
    }

    public List<EstagiarioVaga> list() {
        Sort listEstagiarioVaga = Sort.by("idEstagiariovg");
        return repositoryEstagiario.findAll(listEstagiarioVaga);
    }

    public List<EstagiarioVaga> update(EstagiarioVaga vagaEstagiario) {
        repositoryEstagiario.save(vagaEstagiario);
        return list();
    }

    public List<EstagiarioVaga> delete(Long idEstagiariovg) {
        repositoryEstagiario.deleteById(idEstagiariovg);
        return list();
    }

}
