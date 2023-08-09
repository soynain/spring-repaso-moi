package com.apimoirepaso.apimoirepaso.RepositoriesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apimoirepaso.apimoirepaso.Entities.Persona;
import com.apimoirepaso.apimoirepaso.Repositories.BDDRepositoryInterface;

@Repository
public class PersonaImpl{
    @Autowired
    private BDDRepositoryInterface personaRepo;

    public Persona getPersonaById(int id_usuario){
        return personaRepo.findById(Long.parseLong(String.valueOf(id_usuario))).get();
    }

    public Persona savePersona(Persona persona){
       return personaRepo.save(persona);
    }
}
