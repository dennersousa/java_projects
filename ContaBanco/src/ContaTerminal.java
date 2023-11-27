import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //CRIA UM OBJETO SCANNER PARA LER DO TECLADO (SYSTEM.IN)
        Scanner scanner = new Scanner(System.in);

        // PEDE AO USUÁRIO QUE INSIRA O SEU NÚMERO DA CONTA CORRENTE E REALIZA A CONVERSÃO PARA INTEIRO
        System.out.print("Por fabor, digite o nº da sua Conta Corrente: \n");
        int contaCorrente = Integer.parseInt(scanner.nextLine());

        // PEDE AO USUÁRIO QUE INSIRA O SEU NÚMERO DA AGÊNCIA E REALIZA A CONVERSÃO PARA STRING
        System.out.print("Agora, digite o nº da sua Agência: \n");
        String agenciaBancaria = scanner.nextLine();

        // PEDE AO USUÁRIO QUE INSIRA O SEU NOME E REALIZA A CONVERSÃO PARA STRING
        System.out.print("Agora, digite o seu nome: \n");
        String nomeCliente = scanner.nextLine();

        // PEDE AO USUÁRIO QUE INSIRA O SEU SALDO E REALIZA A CONVERSÃO PARA DECIMAL (DOUBLE)
        System.out.print("E por ultimo, digite o seu saldo: \n");
        double saldoBancario = Double.parseDouble(scanner.nextLine());

        // EXIBIR A MENSAGEM CONTA CRIADA
        System.out.println("Conta criada com sucesso! \n");
        
        //RETORNA A MENSAGEM FINAL PARA O CLIENTE CONSTANDO TODOS OS DADOS
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta Nº" + contaCorrente + " e seu saldo é R$" + saldoBancario + " já está disponível para saque.");

        //FECHA O SCANNER
        scanner.close();
    }
}
