package dev.vxt.appbiketerminal;

public class AppBikeTerminal {

    public static void main(String[] args) {
    System.out.println("Salve, man.\nBem vindo ao A.B");        
    
    String nomeEstacao = "Centro";
    int quantidadeBikeDisponivel = 12;
    double tarifaPorMinuto = 0.50;

    System.out.println(nomeEstacao);
    System.out.println(quantidadeBikeDisponivel);
    System.out.println(tarifaPorMinuto);
    
    System.out.println("Estacao : " + nomeEstacao);
    System.out.println("Bicicletas disponiveis : " + quantidadeBikeDisponivel);
    System.out.println("Tarifa por minuto : " +  tarifaPorMinuto);
    }
}
