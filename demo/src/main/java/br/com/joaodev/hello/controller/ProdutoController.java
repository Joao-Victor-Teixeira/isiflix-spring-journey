package br.com.joaodev.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodev.hello.model.Produto;
import br.com.joaodev.hello.services.IProdutoService;


@RestController
public class ProdutoController {
    
    private final IProdutoService ips;

    public ProdutoController(IProdutoService ips) {
        this.ips = ips;
    }

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod = new Produto();
        prod.setId(12345);
        prod.setDescricao("Computador top de linha");
        prod.setPreco(2500.00);
        prod = ips.aplicarDesconto(prod, 10);
        return prod;
    }

    @PostMapping("/novoproduto")
    public String cadastrarNovo(@RequestBody Produto prod){
        System.out.println("Recebido: "+prod.getId()+" | "+prod.getDescricao()+" | "+prod.getPreco());
        return "Deu tudo certo";
    }

    
}
