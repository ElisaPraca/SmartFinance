package com.smartfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartfinance.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

