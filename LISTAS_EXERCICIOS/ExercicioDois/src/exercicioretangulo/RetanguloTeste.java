package exercicioretangulo;


public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.setLargura(5.0f);
        retangulo1.setAltura(10.0f);

        retangulo2.setLargura(8.0f);
        retangulo2.setAltura(15.0f);

        System.out.println("Retângulo 1 - Perímetro: " + retangulo1.calcularPerimetro() + ", Área: " + retangulo1.calcularArea());
        System.out.println("Retângulo 2 - Perímetro: " + retangulo2.calcularPerimetro() + ", Área: " + retangulo2.calcularArea());
    }
}
