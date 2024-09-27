# Tarefa-Paralelismo-Agregacao

# Linha de Produção de Carros

Este projeto simula uma linha de produção de carros utilizando programação concorrente em Java. O código cria várias instâncias de produção de carros e as executa em paralelo usando `ExecutorService`.

## Estrutura do Código

O projeto é composto por duas classes principais:

### 1. `LinhaProducao`

A classe `LinhaProducao` implementa a interface `Runnable` e representa uma linha de produção para a montagem de carros. Ela contém os seguintes atributos:

- `carroceria`: O tipo de carroceria do carro.
- `motor`: O tipo de motor do carro.
- `portas`: O número e tipo de portas do carro.
- `rodas`: O tipo de rodas do carro.

#### Métodos Principais

- **Construtor**: Inicializa os atributos da classe.
- **Getters e Setters**: Métodos para acessar e modificar os atributos da classe.
- **run()**: Método que contém a lógica de produção do carro. Ele imprime informações sobre a produção e simula um atraso de 3 segundos para representar o tempo necessário para montar o carro.

### 2. `Main`

A classe `Main` é o ponto de entrada do programa e realiza as seguintes operações:

1. Cria um `ExecutorService` com um pool de 2 threads.
2. Instancia quatro objetos `LinhaProducao` com diferentes configurações de carro.
3. Executa as instâncias de produção no `ExecutorService`.
4. Chama `shutdown()` para finalizar o executor após todas as tarefas terem sido submetidas.

## Como Executar o Código

1. Certifique-se de ter o JDK (Java Development Kit) instalado em seu computador.
2. Copie o código para um arquivo Java chamado `Main.java`.
3. Compile o código usando o comando:
   ```bash
   javac Main.java
   ```
