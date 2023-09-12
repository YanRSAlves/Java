package br.com.calculadora;


import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Double num1, num2;
        String operacao;
        
        Scanner scanner = new Scanner(System.in);
        
        /*
        Calculadora conta = new Calculadora();
        
        
        System.out.println("Digite o primeiro numero: ");
        conta.numero1 = scanner.nextDouble();
        
        System.out.println("Digite a operacao: ");
        conta.operacao = scanner.next();
        
        System.out.println("Digite o segundo numero: ");
        conta.numero2 = scanner.nextDouble();
        
        */
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Digite a operacao: ");
        operacao = scanner.next();
        
        Calculadora conta2 = new Calculadora(num1,num2,operacao);
        
        
        switch(conta2.operacao){
            
            case "+":
                System.out.println("O resultado é: " + conta2.adicao());
            break;
            
            case "-":
                System.out.println("O resultado é: " + conta2.subtracao());
            break;
            
            case "*":
                System.out.println("O resultado é: " + conta2.multiplicacao());
            break;
            
            case "/":
                if(conta2.divisao() <= 0){
                    System.out.println("Não Existe divisão por zero");
                }else{
                    System.out.println("O resultado é: " + conta2.divisao());
                }
                
            break;    
              
        }
              
    }
    
}
