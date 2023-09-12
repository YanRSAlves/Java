


public class Veiculo {
    private String modelo;
    private int pesoEmQuilos;
    private int velocMaxEmKmH;
    private double precoEmReais;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPesoEmQuilos() {
        return pesoEmQuilos;
    }

    public void setPesoEmQuilos(int pesoEmQuilos) {
        this.pesoEmQuilos = pesoEmQuilos;
    }

    public int getVelocMaxEmKmH() {
        return velocMaxEmKmH;
    }

    public void setVelocMaxEmKmH(int velocMaxEmKmH) {
        this.velocMaxEmKmH = velocMaxEmKmH;
    }

    public double getPrecoEmReais() {
        return precoEmReais;
    }

    public void setPrecoEmReais(double precoEmReais) {
        this.precoEmReais = precoEmReais;
    }

    public void imprimirDados() {
        if ("Fiat".equals(modelo)) {
            System.out.println("Preco: R$" + precoEmReais + ", Peso: " + pesoEmQuilos + " kg");
        } else {
            System.out.println("Modelo: " + modelo + ", Peso: " + pesoEmQuilos + " kg, Velocidade Maxima: " + velocMaxEmKmH + " km/h, Preco: R$" + precoEmReais);
        }
    }
}