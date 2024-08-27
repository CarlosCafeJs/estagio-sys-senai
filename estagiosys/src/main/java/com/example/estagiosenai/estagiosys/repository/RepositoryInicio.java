package com.example.estagiosenai.estagiosys.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estagiosenai.estagiosys.models.InicioVaga;

@Repository
public interface RepositoryInicio extends JpaRepository<InicioVaga, Long> {

}