package com.example.Desafio_Itau.service;

import com.example.Desafio_Itau.exception.TransacaoInvalidaException;
import com.example.Desafio_Itau.model.Transacao;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class TransacaoService {

    public void salvarTransacao(Transacao transacao){
        if (transacao.getValor() < 0) {
            throw new TransacaoInvalidaException("Valor negativo");
        }
        if (transacao.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new TransacaoInvalidaException("Transação não pode acontecer no futuro");
        }
    }
}
