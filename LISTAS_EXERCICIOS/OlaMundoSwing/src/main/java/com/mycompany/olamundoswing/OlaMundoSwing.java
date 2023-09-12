

package com.mycompany.olamundoswing;

import java.util.Scanner;


public class OlaMundoSwing {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Qual foi a nota deste aluno: ");
        float nota = teclado.nextFloat();
        
        
        System.out.printf("A nota %.1f é sua %s!\n", nota, nome);
        System.out.format("A nota %.1f é sua %s!\n", nota, nome);
    }
}