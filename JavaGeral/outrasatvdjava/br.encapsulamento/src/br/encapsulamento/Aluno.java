
package br.encapsulamento;

public class Aluno extends Pessoa {
    private double media;
    
    public double getMedia(){
        return media;
    }
    
  public void setMedia(double media){
    this.media = media;
    }  
  
 public void imprimirSituacao(){
     if( media >= 7){
         System.out.println("ALUNO APROVADO\n");
     }else {
         System.out.println("ALUNO REPROVADO");
     }
 } 
 public String imprimirMedia(){
     return "Media: " + this.getMedia();
 }
  
  
  
  
}

