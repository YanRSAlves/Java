
package br.encapsulamento;


public class Professor extends Pessoa {
    private double salario;
    
    public double getSalario(){
        return salario;
        
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void depositarSalario(double salario){
        this.salario += salario;
    }
    
}
