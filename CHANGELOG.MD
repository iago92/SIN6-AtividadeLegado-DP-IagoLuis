# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-06

### Adicionado

- Implementação da interface IObserver para definir o contrato dos serviços de notificação (Observadores).

### Corrigido

- Corrigido o erro de compatibilidade de versão do Java que impedia a execução do Maven.

### Modificado

- O serviço "NotificacaoService.java" foi modificado para atuar como o Sujeito, incluindo a lógica para manter e notificar os observadores com os métodos addObserver, removeObserver e notificarObservadores.
- Os serviços de notificação EmailService.java, PushService.java, e SmsService.java foram modificados para implementar a interface do observador e agir como Observadores Concretos.