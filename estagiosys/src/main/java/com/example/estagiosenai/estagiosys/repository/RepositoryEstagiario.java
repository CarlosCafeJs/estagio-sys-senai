package com.example.estagiosenai.estagiosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.estagiosenai.estagiosys.models.EstagiarioVaga;

@Repository
public interface RepositoryEstagiario extends JpaRepository<EstagiarioVaga, Long> {

}
