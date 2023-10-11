package com.UTN.ApiRestConPaginacion.controllers;

import com.UTN.ApiRestConPaginacion.entities.Libro;
import com.UTN.ApiRestConPaginacion.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
