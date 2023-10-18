import Iphone.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {

        //EXEMPLOS

        Iphone iphone = new Iphone();
        
        String numero = "55 54 9998888777";
        String mensagem = "Olá!";
        String url = "www.google.com";
        String musica = "musica.mp3";
        
        iphone.atender(numero);
        iphone.ligar(numero);
        iphone.iniciarCorreioVoz(mensagem, numero);

        iphone.adicionarNovaAba(url);
        iphone.exibirPagina(url);
        iphone.atualizarPagina();

        iphone.tocar(musica);
        iphone.pausar(musica);
        iphone.selecionarMusica(musica);

    }
}
