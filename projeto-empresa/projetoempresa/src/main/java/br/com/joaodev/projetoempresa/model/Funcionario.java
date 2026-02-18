package br.com.joaodev.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_funcional")
    private int numFuncional;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;
    
    @Column(name = "salario")
    private double salario;
    
    @ManyToOne
    @JoinColumn(name = "numero_id") // aqui onde especificamos o nome da coluna na tabela funcionario
    @JsonIgnoreProperties("listaFuncionarios")
    private Departamento depto;

    public int getNumFuncional() {
        return numFuncional;
    }

    public void setNumFuncional(int numFuncional) {
        this.numFuncional = numFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }
}
