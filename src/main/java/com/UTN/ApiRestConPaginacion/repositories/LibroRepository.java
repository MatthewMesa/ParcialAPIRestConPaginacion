package com.UTN.ApiRestConPaginacion.repositories;

import com.UTN.ApiRestConPaginacion.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
