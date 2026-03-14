package com.example.Desafio_Itau.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TransacaoInvalidaException.class)
    public ResponseEntity<Void> handleTransacaoInvalida() {
        return ResponseEntity.unprocessableEntity().build();
    }

}
