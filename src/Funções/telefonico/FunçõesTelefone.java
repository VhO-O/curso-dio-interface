package Funções.telefonico;

public class FunçõesTelefone implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando para o número");
    }

    public void atender(){
        System.out.println("Atendeu a ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciou o correio de voz");
    }
}
