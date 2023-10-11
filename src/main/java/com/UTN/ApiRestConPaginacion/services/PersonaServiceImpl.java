package com.UTN.ApiRestConPaginacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.UTN.ApiRestConPaginacion.entities.Persona;
import com.UTN.ApiRestConPaginacion.repositories.BaseRepository;
import com.UTN.ApiRestConPaginacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        return null;
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro);
            Page<Persona> personas = personaRepository.search2(filtro,pageable);
            //Page<Persona> personas = personaRepository.search3 ();
            return personas;
        }catch (Exception e){
            throw e;
        }
    }
}
