package com.example.Desafio_Itau.controller;

import com.example.Desafio_Itau.model.Transacao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Desafio_Itau.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TrasacaoController {

    final TransacaoService service = new TransacaoService();

    @PostMapping
    public ResponseEntity<Void> getTrasancao(@RequestBody Transacao transacao) {
        service.salvarTransacao(transacao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTransacao() {
        return ResponseEntity.ok().build();
    }
}
