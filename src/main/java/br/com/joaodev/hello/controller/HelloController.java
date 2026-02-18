package br.com.joaodev.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Tornei a classe HelloController um Controlador REST
// Vai expor os métodos na fora de URLs
@RestController
public class HelloController {

    /*
     * Atraves dessa anotação, temos um caminho de url definido
     *
     * http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Curso Modern Web Development";
    }

    @GetMapping("/hellohtml")
    public String sayHelloEmHTML() {
        return "   <html>"
                + "<body>"
                + "   <h1> Ola </h1>"
                + "<hr>"
                + "<p> Curso web development </p>"
                + "</body>"
                + "</html>";
    }

    @GetMapping("/bagunca")
    public String baguncaTotal() {
        return "<html>"
                + "<head>"
                + "  <style>body { background-color: #f0f0f0; font-family: sans-serif; }</style>"
                + "</head>"
                + "<body>"
                + "  <h1>O Java mandou avisar:</h1>"
                + "  <button onclick='minhaFuncao()'>CLIQUE EM MIM</button>"
                + "  <script>"
                + "    function minhaFuncao() {"
                + "       alert('Isso foi gerado dentro de uma String no Java! ☕ + 📜');"
                + "       console.log('O Backend está controlando o Frontend');"
                + "    }"
                + "  </script>"

                + "</body>"
                + "</html>";
    }
}
