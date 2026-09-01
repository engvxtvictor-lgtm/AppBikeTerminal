package dev.vxt.appbiketerminal;

import java.util.Scanner;

public class AppBikeTerminal {

    public static void main(String[] args) {
    System.out.println("Salve, man.\nBem vindo ao A.B");        
    
    String nomeEstacao = "Centro";
    int quantidadeBikeDisponivel = 12;
    double tarifaPorMinuto = 0.50;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Salve, informe o numero da matricula, por favor!");
    int matricula  =  entrada.nextInt();
    entrada.nextLine();
    
    System.out.println("Estacao : " + nomeEstacao); 
    System.out.println("Bicicletas disponiveis : " + quantidadeBikeDisponivel);    
    System.out.println("Tarifa por minuto : " +  tarifaPorMinuto);    
    System.out.println("Matricula informada : " + matricula);
    
    System.out.println("Informe a estacao de destino, por favor!: " );
    String estacaoDestino = entrada.nextLine();
    System.out.println("Estacao de destino informada: "+ estacaoDestino);
    
    System.out.println("Informe o tempo estimado de uso em minutos, por favor!: " ); 
    int tempoUso = entrada.nextInt();
    System.out.println("Estimativa de tempo de uso informada: "+ tempoUso);
    
    double valorCorrida = tempoUso * tarifaPorMinuto;
    System.out.printf("Valor total da corrida %.2f", valorCorrida);

    System.out.println("========================================");
    System.out.println("Recibo de uso - AppBike");
    System.out.println("========================================");
    
    System.out.println("Matricula : " + matricula);
    System.out.println("Estacao : " + nomeEstacao); 
    System.out.println("Estacao de destino: "+ estacaoDestino);
    System.out.println("Estimativa de tempo de uso: "+ tempoUso);
    System.out.printf("Valor total da corrida %.2f", valorCorrida);
    System.out.println("========================================");
    System.out.println("Tmj, espero que tenha gostado!\n valeu por usar o AppBike");
    }
}
