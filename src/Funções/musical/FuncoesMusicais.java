package Funções.musical;

public class FuncoesMusicais implements ReprodutorMusical{
    public void tocar(){
        System.out.println("Música começou a tocar");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(){
    System.out.println("Selecione a Música");
    }
}
