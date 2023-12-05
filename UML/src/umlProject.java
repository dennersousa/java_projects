// Interface para Reprodutor Musical
interface MusicPlayer {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface para Aparelho Telefônico
interface Phone {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface InternetBrowser {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que implementa as interfaces
class iPhone implements MusicPlayer, Phone, InternetBrowser {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}

// Exemplo de uso
public class umlProject {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();
        myPhone.tocar();
        myPhone.ligar();
        myPhone.exibirPagina();
    }
}
