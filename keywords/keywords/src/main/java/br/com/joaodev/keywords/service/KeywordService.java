package br.com.joaodev.keywords.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.joaodev.keywords.exceptions.ConflictException;
import br.com.joaodev.keywords.exceptions.NotFoundException;
import br.com.joaodev.keywords.model.Keyword;
import br.com.joaodev.keywords.repo.IKeywordRepo;

@Service
public class KeywordService {

    private final IKeywordRepo repo;

    public KeywordService(IKeywordRepo repo) {
        this.repo = repo;
    }

    public Keyword create(Keyword keyword) {
        Keyword res = repo.findByKeyword(keyword.getKeyword());
        if (res != null) {
            throw new ConflictException("Keyword already exists");
        }
        return repo.save(keyword);
    }

    public List<Keyword> readAll() {
        return repo.findAll();
    }

    public Keyword readById(Integer id) {
        return repo.findById(id).orElseThrow(()->new NotFoundException("Keyword not found"));
    }
}
