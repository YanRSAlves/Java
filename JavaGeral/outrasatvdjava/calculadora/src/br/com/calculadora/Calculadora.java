package br.com.calculadora;

public class Calculadora {

    Double numero1;
    Double numero2;
    String operacao;


    public Calculadora() {
    }
    
    public Calculadora(Double num1, Double num2, String operacao){
        this.numero1 = num1;
        this.numero2 = num2;
        this.operacao = operacao;
    }
    
    
    
    Double adicao() {
           
        return numero1 + numero2;
    }
    
    Double subtracao() {
        Double resultado = numero1 - numero2;
        
        return resultado;
    }
    
    Double multiplicacao() {
        Double resultado = numero1 * numero2;
        
        return resultado;
    }
    
    Double divisao() {
        
        
        Double resultado;
        
        if(numero2 <= 0){
            return 0.0;
        }else{
            resultado = numero1 / numero2;
             return resultado;
        }
    }
    
    
}
