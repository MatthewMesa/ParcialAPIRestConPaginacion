package com.UTN.ApiRestConPaginacion.repositories;

import com.UTN.ApiRestConPaginacion.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
