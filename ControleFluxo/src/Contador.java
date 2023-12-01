import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Adicionando validação de entrada para garantir valores inteiros
        int parametroUm, parametroDois;
        try {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = Integer.parseInt(terminal.next());
            System.out.println("Digite o segundo parâmetro");
            parametroDois = Integer.parseInt(terminal.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira valores inteiros válidos.");
            terminal.close();
            return;
        }

        // Adicionando opção para escolher o tipo de controle de fluxo
        System.out.println("Escolha o tipo de controle de fluxo (1 - for, 2 - while, 3 - do-while): ");
        int opcaoControle = terminal.nextInt();

        try {
            switch (opcaoControle) {
                case 1:
                    contarComFor(parametroUm, parametroDois);
                    break;
                case 2:
                    contarComWhile(parametroUm, parametroDois);
                    break;
                case 3:
                    contarComDoWhile(parametroUm, parametroDois);
                    break;
                default:
                    System.out.println("Opção inválida. Saindo do programa.");
            }
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    // Adicionando mensagem personalizada para a contagem no método contarComFor
    static void contarComFor(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        System.out.println("Digite a mensagem para a contagem: ");
        Scanner terminal = new Scanner(System.in);
        String mensagemContagem = terminal.nextLine();
        terminal.close();

        int contagem = parametroDois - parametroUm + 1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(mensagemContagem + " " + i);
        }
    }

    // Adicionando método contarComWhile
    static void contarComWhile(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Implemente a lógica de contagem usando while aqui
    }

    // Adicionando método contarComDoWhile
    static void contarComDoWhile(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Implemente a lógica de contagem usando do-while aqui
    }
}
