package cl.rodrigo.springsecurity.springsecurity.controller;

import cl.rodrigo.springsecurity.springsecurity.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ContactoController  {

    private final ContactoRepository contactoRepository;
    @GetMapping("/contactos")
    public ResponseEntity<?> listaContacto() {

        return  ResponseEntity.ok().body(contactoRepository.findAll());
    }
}
