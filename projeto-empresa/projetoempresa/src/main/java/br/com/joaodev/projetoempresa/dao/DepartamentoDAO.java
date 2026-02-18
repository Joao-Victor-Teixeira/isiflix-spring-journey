package br.com.joaodev.projetoempresa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.joaodev.projetoempresa.model.Departamento;

@Repository
public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

    public List<Departamento> findByOrderByNome(); 

    public List<Departamento> findByAndar(int andar);

    public List<Departamento> findByOrderByNumeroIdDesc();

    public List<Departamento> findByNumeroIdOrAndar(int numeroId, int andar); 
}
