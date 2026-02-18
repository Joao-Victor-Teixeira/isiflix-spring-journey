package br.com.joaodev.hello.services;

import br.com.joaodev.hello.model.Produto;

public interface IProdutoService {

    public Produto aplicarDesconto(Produto prod ,double percentual);
}
