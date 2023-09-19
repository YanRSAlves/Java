class Retangulo {
    private double largura;
    private double altura;
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        }
    }
    
    public double perimetro() {
        return 2 * (largura + altura);
    }
    
    public double area() {
        return largura * altura;
    }
}
