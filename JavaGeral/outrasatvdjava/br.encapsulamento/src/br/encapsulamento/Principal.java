
package br.encapsulamento;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        
        System.out.println("Digite o nome do ALUNO: ");
        aluno1.setNome(sc.nextLine());
        
        System.out.println("Digite a MATRICULA: ");
        aluno1.setMatricula(sc.nextLine());
        
        System.out.println("Digite a MEDIA: ");
        aluno1.setMedia(sc.nextDouble());
        
        System.out.println("DADOS DO ALUNO:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matricula: " + aluno1.getMatricula());
        System.out.println("Media: " + aluno1.getMedia());
        aluno1.imprimirSituacao();
        
        System.out.println("DADOS DO PROFESSOR:");
        System.out.println("Digte o nome do PROFESSOR: ");
        professor1.setNome(sc.nextLine());
        
        System.out.println("Digite a MATRICULA: ");
        professor1.setMatricula(sc.nextLine());
        
        System.out.println("Qual o salario deste Professor: ");
        professor1.setSalario(sc.nextDouble());
        
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Matricula: " + professor1.getMatricula());
        System.out.println("Salario: " + professor1.getSalario());
        
        
        
        
        System.out.println(formula(2));
        
       
        
        
        
    }
    
    static Integer formula(Integer numero){
        
       Integer resultado = 2 + numero; 
       System.out.println(resultado);
       return resultado;
       
       
    }
    
}
