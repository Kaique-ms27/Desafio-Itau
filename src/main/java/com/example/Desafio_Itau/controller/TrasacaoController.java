package com.example.Desafio_Itau.controller;

import com.example.Desafio_Itau.model.Transacao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Desafio_Itau.service.TransacaoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TrasacaoController {

    final TransacaoService service = new TransacaoService();

    @PostMapping
    public ResponseEntity<Void> getTrasancao(@RequestBody Transacao transacao) {
        service.salvarTransacao(transacao);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
