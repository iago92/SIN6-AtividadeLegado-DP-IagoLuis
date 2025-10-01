package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IObserver { // Implementa a interface
    @Override
    public void update(Pedido pedido) { // Renomeado de 'enviar' para 'update'
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
}