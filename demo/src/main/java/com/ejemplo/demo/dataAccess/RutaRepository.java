package com.ejemplo.demo.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.demo.modelo.Ruta;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Integer> {}