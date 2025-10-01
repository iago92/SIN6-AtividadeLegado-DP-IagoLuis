// notificacao/service/IObserver.java

package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;

public interface IObserver {
    /**
     * Método chamado pelo Sujeito para notificar o Observador
     * sobre uma mudança de estado, passando o Pedido.
     */
    void update(Pedido pedido);
}