package br.com.joaodev.keywords.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodev.keywords.model.Label;
import br.com.joaodev.keywords.service.LabelService;

@RestController
public class LabelController {

    private final LabelService service;

    public LabelController(LabelService service) {
        this.service = service;
    }
 
    @PostMapping("/labels")
    public ResponseEntity<Label> addNew(@RequestBody Label newLabel){
        return ResponseEntity.status(201).body(service.createNew(newLabel));
    }

    @GetMapping("/labels")
    public ResponseEntity<List<Label>> getAll(){
        return ResponseEntity.ok(service.readAll());
    }

    @GetMapping("/labels/{keyword}")
    public ResponseEntity<List<Label>> getFromKeyword(@PathVariable String keyword){
        return ResponseEntity.ok(service.readByKeyword(keyword));
    }
}
