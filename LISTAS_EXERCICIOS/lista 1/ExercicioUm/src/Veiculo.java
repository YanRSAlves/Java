class Veiculo {
    private String proprietario;
    private int ano;
    private String modelo;
    private int peso;
    private int velocMax;
    private double preco;
    
    public String getProprietario() {
        return proprietario;
    }
    
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getVelocMax() {
        return velocMax;
    }
    
    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void imprimirDados() {
        if (peso >= 1500) {
            System.out.println("Modelo: " + modelo);
            System.out.println("Preço: " + preco);
        } else {
            System.out.println("Proprietario: " + proprietario);
            System.out.println("Ano: " + ano);
            System.out.println("Modelo: " + modelo);
            System.out.println("Peso: " + peso + " kg");
            System.out.println("Velocidade Maxima: " + velocMax + " Km/h");
            System.out.println("Preço: R$ " + preco);
        }
    }
}

