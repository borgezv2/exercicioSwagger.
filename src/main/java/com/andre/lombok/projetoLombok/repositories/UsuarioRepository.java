package com.andre.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
