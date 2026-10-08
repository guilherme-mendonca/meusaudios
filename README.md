# Audio Player - Prática de POO em Java

Projeto desenvolvido para aplicar os pilares da **Programação Orientada a Objetos (POO)** em Java, simulando a estrutura de uma aplicação de áudios com suporte a músicas e podcasts.

## Conceitos de POO Aplicados

- **Encapsulamento:** Atributos protegidos com o modificador `private` na classe `Audio` e manipulados via métodos controlados (`curte()`, `reproduz()`).
- **Herança:** As classes `Musica` e `Podcast` estendem a superclasse `Audio`, aproveitando comportamentos comuns e adicionando atributos específicos (como artista e apresentador).
- **Interfaces e Polimorfismo:** A interface `Classificavel` padroniza o contrato de avaliação. As subclasses usam `@Override` no método `getClassificacao()` para implementar regras específicas.
- **Desacoplamento:** A classe `MinhasPreferidas` consome a interface `Classificavel`, processando mídias sem depender de implementações concretas.