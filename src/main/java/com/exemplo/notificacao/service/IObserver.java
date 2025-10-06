package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface IObserver {
    //update é o metodo chamado pelo Sujeito para notificar o Observador
    void update(Pedido pedido);
}