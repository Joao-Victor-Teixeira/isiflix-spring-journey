package br.com.joaodev.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodev.projetoempresa.dao.DepartamentoDAO;
import br.com.joaodev.projetoempresa.model.Departamento;

@RestController
public class DepartamentoController {

    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        return (ArrayList<Departamento>)dao.findAll();
    }
}
