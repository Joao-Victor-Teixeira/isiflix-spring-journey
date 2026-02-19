package br.com.joaodev.keywords.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.joaodev.keywords.exceptions.ConflictException;
import br.com.joaodev.keywords.exceptions.NotFoundException;
import br.com.joaodev.keywords.model.Label;
import br.com.joaodev.keywords.repo.ILabelRepo;

@Service
public class LabelService {

    private final ILabelRepo repo;

    public LabelService(ILabelRepo repo) {
        this.repo = repo;
    }

    public Label createNew(Label label){
        Label res = repo.findByValue(label.getValue());
        if (res != null) {
            throw new ConflictException("Label already exists");
        }
        return repo.save(label);
    }

    public List<Label> readAll(){
        return repo.findAll();
    }

    public Label readById(Integer id){
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Label not found"));
    }

    public List<Label> readByKeyword(String keyword){
        return repo.findByKeywordsKeyword(keyword);
    }
}
