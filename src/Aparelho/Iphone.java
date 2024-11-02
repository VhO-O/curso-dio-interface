package Aparelho;

import Funções.internet.NavegadorInternet;
import Funções.multifuncional.Multifuncoes;
import Funções.musical.ReprodutorMusical;
import Funções.telefonico.AparelhoTelefonico;

public class Iphone {
    public static void main(String [] args){
        Multifuncoes mu = new Multifuncoes();
        NavegadorInternet internet = mu;
        AparelhoTelefonico telefonico = mu;
        ReprodutorMusical musical = mu;

        System.out.println("App de música");
        musical.tocar();
        musical.pausar();
        musical.selecionarMusica();
        System.out.println("\nApp Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        System.out.println("\nNavegador");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();

    }
}
