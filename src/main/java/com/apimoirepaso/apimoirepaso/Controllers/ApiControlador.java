package com.apimoirepaso.apimoirepaso.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apimoirepaso.apimoirepaso.Entities.Persona;
import com.apimoirepaso.apimoirepaso.RepositoriesImpl.PersonaImpl;

@RestController
@RequestMapping("/main")
public class ApiControlador {

    @Autowired
    private PersonaImpl personaRepoImpl;



    @GetMapping("/hola")
    public ResponseEntity<String> getHolaMundoEjemplo() {
        return ResponseEntity.status(HttpStatus.OK).body("Hola mundo");
    }

    @GetMapping("/get-persona/{id_usuario}")
    public ResponseEntity<Persona> solicitarUsuarioDato(@PathVariable int id_usuario) {
        return ResponseEntity.ok().body(personaRepoImpl.getPersonaById(id_usuario));
    }

    @PostMapping("/ins-persona")
    public ResponseEntity<Persona> insertarDatosUsuario(@RequestBody Persona persona) {
    //
        return ResponseEntity.ok().body(personaRepoImpl.savePersona(persona));
    }
}
