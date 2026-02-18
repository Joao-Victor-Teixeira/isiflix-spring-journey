package br.com.joaodev.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodev.hello.model.Usuario;

@RestController
public class UsuarioController {
    
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
        System.out.println("Recebido = " + dadosLogin.getEmail() + " | " + dadosLogin.getSenha());
        if (dadosLogin.getEmail().equals("joao@joao.com")) {
            if (dadosLogin.getSenha().equals("1234")) {
                Usuario resposta = new Usuario();
                resposta.setId(54321);
                resposta.setNome("Joao");
                resposta.setEmail(dadosLogin.getEmail());
                resposta.setSenha("**********");
                // Retorno a resposta de código 200 - ok
                return ResponseEntity.ok(resposta);
            }
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.notFound().build();
    }
}
