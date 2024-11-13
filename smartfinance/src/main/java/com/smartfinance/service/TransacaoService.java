package com.smartfinance.service;

import com.smartfinance.model.Transacao;
import com.smartfinance.model.Usuario;
import com.smartfinance.repository.TransacaoRepository;
import com.smartfinance.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private UsuarioService usuarioService;

    public Transacao criarTransacao(Long usuarioId, Transacao transacao) {
        Usuario usuario = usuarioService.buscarUsuarioPorId(usuarioId);

        // Validar e atualizar saldo de acordo com o tipo da transação
        // Adicionar lógica de processamento

        transacao.setUsuario(usuario);
        transacao.setDataHora(LocalDateTime.now());

        return transacaoRepository.save(transacao);
    }
}
