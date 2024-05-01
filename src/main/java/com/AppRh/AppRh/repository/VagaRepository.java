package com.AppRh.AppRh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppRh.AppRh.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, String> {
    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);

}
