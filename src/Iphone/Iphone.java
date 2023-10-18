package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada ao navegador: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo ligação do número: " + numero);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String numero) {
        System.out.println("Enviando mensagem '" + mensagem + "' para o número: " + numero);
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo a música '" + musica + "'");
    }

    @Override
    public void pausar(String musica) {
        System.out.println("A música '" + musica + "' foi pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
}
