# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - DATA

### Adicionado

Foi adicionado a interface do padrão observer no arquivo IObserver.java

### Corrigido

Foi corrido o erro com a versão do java que impedia a execução do Maven

### Modificado

Foi modificado os arquivos EmailService.java, PushService.java e SmsService.java
Foi alterado o arquivo NotificaçãoService.java o tornando o sujeito do padrão Observer com metodos para adicionar e remover observadores e um metodo para notificar