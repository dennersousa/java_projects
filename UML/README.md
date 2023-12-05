# iPhone Component - Java

Este repositório contém a implementação em Java de um componente básico que representa um iPhone. O objetivo é demonstrar a modelagem de classes e interfaces usando UML para os papéis de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Conteúdo

1. [UML Diagram](#uml-diagram)
2. [Estrutura do Projeto](#estrutura-do-projeto)
3. [Como Usar](#como-usar)
4. [Exemplo de Uso](#exemplo-de-uso)

## UML Diagram

```
          +------------------+
          |      iPhone      |
          +------------------+
          |                  |
          |                  |
          +------------------+
          /        |         \
         /         |          \
        /          |           \
+-------+      +--------+      +---------------+
| Music |      | Phone  |      | Internet      |
+-------+      +--------+      +---------------+
|       |      |        |      |               |
+-------+      +--------+      +---------------+
| tocar |      | ligar  |      | exibirPagina  |
| pausar|      | atender|      | adicionarAba  |
| selec |      | iniciar|      | atualizarPag  |
+-------+      +--------+      +---------------+
```

## Estrutura do Projeto

- `iPhone.java`: Implementação da classe `iPhone` que representa o componente.
- `MusicPlayer.java`: Interface para o papel de Reprodutor Musical.
- `Phone.java`: Interface para o papel de Aparelho Telefônico.
- `InternetBrowser.java`: Interface para o papel de Navegador na Internet.
- `Main.java`: Exemplo de uso do componente iPhone.

## Como Usar

Certifique-se de ter o ambiente de desenvolvimento Java configurado em sua máquina. Você pode compilar e executar o projeto usando um IDE como o Eclipse ou através da linha de comando.

```bash
# Compilar
javac umlProject.java

# Executar
java umlProject
```

## Exemplo de Uso

```java
iPhone myPhone = new iPhone();
myPhone.tocar();
myPhone.ligar();
myPhone.exibirPagina();
```

Este é um exemplo simples para ilustrar o uso do componente iPhone.

Sinta-se à vontade para explorar, modificar e expandir conforme necessário para atender aos requisitos específicos do seu projeto.