package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// Sujeito
public class NotificacaoService { 

    // Lista de observadores
    private final List<IObserver> observers = new ArrayList<>();

    // O Spring injetará todas as implementações de IObserver no construtor
    public NotificacaoService(List<IObserver> observers) {
        this.observers.addAll(observers);
    }

    // método para adicionar Observador
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    // método para remover Observador
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    //metodo que notifica os observadores usando o update
    public void notificarObservadores(Pedido pedido) {
        System.out.println("\n Sujeito Notificando Observadores sobre Pedido: " + pedido.getCliente());
        for (IObserver observer : observers) {
            observer.update(pedido);
        }
    }

    // metodo original do projeto antes da refatoração, ele vai chamar o metodo novo
    public void enviarNotificacoes(Pedido pedido) {
        notificarObservadores(pedido);
    }
}