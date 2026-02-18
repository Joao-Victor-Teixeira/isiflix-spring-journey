package br.com.joaodev.hello.services;

import org.springframework.stereotype.Service;

import br.com.joaodev.hello.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService {

    @Override
    public Produto aplicarDesconto(Produto prod, double percentual) {
        double novoPreco = prod.getPreco() - prod.getPreco() * percentual / 100;
        prod.setPreco(novoPreco);
        return prod;
    }

}
