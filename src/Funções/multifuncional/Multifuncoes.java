package Funções.multifuncional;

import Funções.internet.NavegadorInternet;
import Funções.musical.ReprodutorMusical;
import Funções.telefonico.AparelhoTelefonico;

public class Multifuncoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina por meio multifuncional");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba por meio multifuncional");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina por meio multifuncional");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica por meio multifuncional");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica por meio multifuncional");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica por meio multifuncional");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para o número por meio multifuncional");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação por meio multifuncional");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz por meio multifuncional");
    }
}
