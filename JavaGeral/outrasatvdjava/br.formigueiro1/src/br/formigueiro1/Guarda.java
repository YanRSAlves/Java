package br.formigueiro1;


public class Guarda extends Preta{
    private double comida;
    
    public double getComida(){
        return comida;
    }
    public void setComida(double comida){
            this.comida = comida;
    }
    public void depositarComida (double comida){
        this.comida += comida;
    }
}
