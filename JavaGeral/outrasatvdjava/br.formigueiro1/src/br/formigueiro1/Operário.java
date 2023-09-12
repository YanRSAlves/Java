package br.formigueiro1;


public class Operário extends Preta {
    private double media;
    
    public double getMedia () {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public void imprimirSituacao(){
        if (media >= 7){
            System.out.println("PROMOVIDO A GUARDA REAL");
        }else{
            System.out.println("OPERÁRIA RECUSADA");
        }
    }
    public String imprimirMedia (){
        return "Media:" + this.getMedia();
    }
    
}
