package Formiga;


public class Marrom {
    private String nome;
    private String numero;
    
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero (String numero) {
        this.numero = numero;
    }
    public String imprimirDados (){
       return "Nome: " + this.getNome() + "Numero:" + this.getNumero();
    }
}
