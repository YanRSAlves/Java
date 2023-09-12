package exerciciodois;

import exercicioretangulo.Retangulo;


public class Principal {

    public static void main(String[] args) {
       // Teste da classe Veiculo
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();

        veiculo1.setProprietario("Joao");
        veiculo1.setAno(2022);

        veiculo2.setProprietario("Maria");
        veiculo2.setAno(2020);

        System.out.println("Veiculo 1 - Proprietario: " + veiculo1.getProprietario() + ", Ano: " + veiculo1.getAno());
        System.out.println("Veiculo 2 - Proprietario: " + veiculo2.getProprietario() + ", Ano: " + veiculo2.getAno());

        // Teste da classe Empregado
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado1.setNome("Carlos");
        empregado1.setMatricula("12345");
        empregado1.setIdade(30);
        empregado1.setSalario(3000.0);

        empregado2.setNome("Ana");
        empregado2.setMatricula("67890");
        empregado2.setIdade(25);
        empregado2.setSalario(2500.0);

        System.out.println("Empregado 1 - Nome: " + empregado1.getNome() + ", Salario: " + empregado1.getSalario());
        System.out.println("Empregado 2 - Nome: " + empregado2.getNome() + ", Salario: " + empregado2.getSalario());
    
        // Teste da classe Retangulo de outro pacote
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.setLargura(5.0f);
        retangulo1.setAltura(10.0f);

        retangulo2.setLargura(8.0f);
        retangulo2.setAltura(15.0f);

        System.out.println("Retangulo 1 - Perimetro: " + retangulo1.calcularPerimetro() + ", Area: " + retangulo1.calcularArea());
        System.out.println("Retangulo 2 - Perimetro: " + retangulo2.calcularPerimetro() + ", Area: " + retangulo2.calcularArea());
    
    }
    
}
