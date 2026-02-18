package br.com.joaodev.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.joaodev.projetoempresa.model.Departamento;

@Repository
public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
