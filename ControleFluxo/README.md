# Desafio Controle de Fluxo

## Descrição do Projeto

Este projeto implementa um sistema simples de controle de fluxo em Java, onde o usuário insere dois parâmetros via terminal, representando dois números inteiros. Com base nesses números, o programa realiza a contagem e imprime os números incrementados no console.

## Funcionalidades Implementadas

1. **Validação de Entrada:**
   - Foi adicionada a validação para garantir que os valores inseridos pelo usuário sejam inteiros. Caso contrário, o programa solicitará novamente a entrada.

2. **Controle de Fluxo Personalizado:**
   - O usuário agora pode escolher entre três tipos de controle de fluxo: `for`, `while`, e `do-while`. Isso oferece maior flexibilidade ao usuário para decidir como a contagem será realizada.

3. **Mensagem Personalizada de Contagem (no método `contarComFor`):**
   - Adicionada a opção para o usuário inserir uma mensagem personalizada que será exibida durante a contagem. Isso permite uma experiência mais personalizada ao usuário.

## Instruções de Uso

1. Execute o programa e insira os dois parâmetros inteiros quando solicitado.
2. Escolha o tipo de controle de fluxo desejado (1 - for, 2 - while, 3 - do-while).
3. Caso o segundo parâmetro seja menor que o primeiro, uma exceção será lançada, informando que o "segundo parâmetro deve ser maior que o primeiro".
4. Insira uma mensagem personalizada para a contagem (apenas para o tipo `for`).
5. A contagem será realizada conforme as escolhas do usuário.

## Melhorias Futuras

1. **Implementação dos Métodos `contarComWhile` e `contarComDoWhile`:**
   - Os métodos `contarComWhile` e `contarComDoWhile` foram adicionados com comentários indicando onde implementar a lógica de contagem específica para cada tipo de controle de fluxo.

2. **Adição de Mais Controles de Fluxo:**
   - Pode-se expandir as opções de controle de fluxo para incluir outras estruturas, como `switch` e `if-else`, proporcionando ainda mais opções aos usuários.

3. **Tratamento de Exceções Adicionais:**
   - Adicionar tratamento de exceções para outros cenários, como valores não numéricos, para tornar o programa ainda mais robusto.

## Execução do Programa

```bash
javac Contador.java
java Contador
```

Siga as instruções no console para inserir os parâmetros e escolher as opções desejadas.

---
