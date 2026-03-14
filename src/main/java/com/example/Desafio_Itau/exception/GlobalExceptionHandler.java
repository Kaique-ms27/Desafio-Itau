package com.example.Desafio_Itau.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;


@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TransacaoInvalidaException.class)
    public ResponseEntity<Void> handleTransacaoInvalida() {
        return ResponseEntity.unprocessableEntity().build();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Void> handleJsonInvalido() {
        return ResponseEntity.badRequest().build();
    }

}
