// notificacao/service/NotificacaoService.java

package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificacaoService { // Sujeito

    // Lista de observadores (os serviços de notificação)
    private final List<IObserver> observers = new ArrayList<>();

    // O Spring injetará todas as implementações de IObserver no construtor
    public NotificacaoService(List<IObserver> observers) {
        this.observers.addAll(observers);
    }

    // Método para adicionar um Observador
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    // Método para remover um Observador
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    /**
     * O método central que notifica todos os observadores.
     * Simula a mudança de estado que aciona as notificações.
     */
    public void notificarObservadores(Pedido pedido) {
        System.out.println("\n Sujeito Notificando Observadores sobre Pedido: " + pedido.getCliente());
        for (IObserver observer : observers) {
            observer.update(pedido);
        }
    }

    // O metodo original foi renomeado e simplificado para seguir o padrão
    public void enviarNotificacoes(Pedido pedido) {
        notificarObservadores(pedido);
    }
}