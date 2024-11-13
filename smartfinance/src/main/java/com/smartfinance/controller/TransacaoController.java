package com.smartfinance.controller;

import com.smartfinance.model.Transacao;
import com.smartfinance.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/{usuarioId}")
    public Transacao criarTransacao(@PathVariable Long usuarioId, @RequestBody Transacao transacao) {
        return transacaoService.criarTransacao(usuarioId, transacao);
    }

    @GetMapping("/{usuarioId}")
    public List<Transacao> buscarTransacoesPorUsuario(@PathVariable Long usuarioId) {
        return transacaoService.buscarTransacoesPorUsuario(usuarioId);
    }
}
