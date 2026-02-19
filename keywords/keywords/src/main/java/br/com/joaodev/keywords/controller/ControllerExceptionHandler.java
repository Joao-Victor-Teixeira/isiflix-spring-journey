package br.com.joaodev.keywords.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.joaodev.keywords.exceptions.ConflictException;
import br.com.joaodev.keywords.exceptions.NotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<?> handConflict(ConflictException ex){
        return ResponseEntity.status(409).body(ex.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> handleNotFound(NotFoundException ex){
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
