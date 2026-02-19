package br.com.joaodev.keywords.repo;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import br.com.joaodev.keywords.model.Label;

public interface ILabelRepo extends ListCrudRepository<Label, Integer> {

    public Label findByValue(String value);

    public List<Label> findByKeywordsKeyword(String keywords);
}
