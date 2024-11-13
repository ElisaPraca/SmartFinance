package com.smartfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartfinance.model.Transacao;
import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByUsuarioId(Long usuarioId);
}
