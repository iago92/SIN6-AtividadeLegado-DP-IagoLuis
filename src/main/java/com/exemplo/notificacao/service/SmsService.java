package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
// A classe agora implementa a interface do Observer
public class SmsService implements IObserver { 
    @Override
    // trocado o metodo de enviar para o metodo de update da interface
    public void update(Pedido pedido) { 
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
}