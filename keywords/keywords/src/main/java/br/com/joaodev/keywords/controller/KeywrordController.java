package br.com.joaodev.keywords.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodev.keywords.model.Keyword;
import br.com.joaodev.keywords.service.KeywordService;

@RestController
public class KeywrordController {

    private final KeywordService service;

    public KeywrordController(KeywordService service) {
        this.service = service;
    }

    @PostMapping("/keywords")
    public ResponseEntity<Keyword> addNew(@RequestBody Keyword newKeyword){
        return ResponseEntity.status(200).body(service.create(newKeyword));
    }

    @GetMapping("/keywords")
    public ResponseEntity<List<Keyword>> getAll(){
        return ResponseEntity.ok(service.readAll());
    }

    @GetMapping("/keywords/{id}")
    public ResponseEntity<Keyword> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.readById(id));
    }
}
