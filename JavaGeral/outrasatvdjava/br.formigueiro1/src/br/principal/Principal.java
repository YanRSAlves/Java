package br.principal;

import br.formigueiro1.Operário;
import java.util.Scanner;


public class Principal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Operário a = new Operário();
        
        System.out.println("Digite o nome da operária ");
        a.setNome(sc.nextLine());
        System.out.println("Digite o número da operária");
        a.setNumero(sc.nextLine());
        System.out.println("Digite a Média");
        a.setMedia (sc.nextDouble());
        
        System.out.println("Dados Operária");
        System.out.println("Nome:" + a.getNome());
        System.out.println("Número:" + a.getNumero());
        System.out.println("Media:" + a.getMedia());
        a.imprimirSituacao();
        
        System.out.println("");
    }
}
