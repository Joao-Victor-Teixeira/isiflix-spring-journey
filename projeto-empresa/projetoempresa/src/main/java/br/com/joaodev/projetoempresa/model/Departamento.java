package br.com.joaodev.projetoempresa.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_id")
    private int numeroId;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "andar", nullable = false)
    private int andar;

    @OneToMany(mappedBy = "depto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("depto")    
    private List<Funcionario> listaFuncionarios;

    public int getNumeroId() {
        return numeroId;
    }
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    
}
