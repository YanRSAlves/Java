package exercicioretangulo;


public class Retangulo {
    private float largura;
    private float altura;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Valor de largura inválido.");
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Valor de altura inválido.");
        }
    }

    public float calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public float calcularArea() {
        return largura * altura;
    }
}
