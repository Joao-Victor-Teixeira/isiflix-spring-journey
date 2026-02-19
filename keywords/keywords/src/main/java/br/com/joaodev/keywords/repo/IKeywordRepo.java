package br.com.joaodev.keywords.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.joaodev.keywords.model.Keyword;

public interface IKeywordRepo extends ListCrudRepository<Keyword, Integer> {

    public Keyword findByKeyword(String keyword);
}
