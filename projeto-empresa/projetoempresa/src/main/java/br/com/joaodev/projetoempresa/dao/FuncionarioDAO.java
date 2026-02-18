package br.com.joaodev.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.joaodev.projetoempresa.model.Funcionario;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer> {

}
