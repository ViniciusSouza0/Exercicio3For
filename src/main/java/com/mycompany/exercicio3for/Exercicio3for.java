package com.mycompany.exercicio3for;
import java.util.Scanner;

public class Exercicio3for {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Quantas provas tem para corrigir?");
        int n = teclado.nextInt();
        System.out.println("Digite a nota que cada aluno tirou:");
        
        double soma = 0;
        
        for(int i = 0; i < n; i++){
            double y = teclado.nextDouble();
            soma += y;
        }
        soma/=n;
        System.out.printf("a media é %.1f",soma);
    }
}
