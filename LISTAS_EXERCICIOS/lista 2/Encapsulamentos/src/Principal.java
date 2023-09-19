


public class Principal {

    public static void main(String[] args) {
        System.out.println("Exercicio 2");
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setModelo("Ford");
        veiculo1.setPesoEmQuilos(1500);
        veiculo1.setVelocMaxEmKmH(200);
        veiculo1.setPrecoEmReais(75000.0);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setModelo("Fiat");
        veiculo2.setPesoEmQuilos(1200);
        veiculo2.setPrecoEmReais(45000.0);

        veiculo1.imprimirDados();
        veiculo2.imprimirDados();
        
        
        System.out.println("\n\nExercicio 3");
        Empregado empregado1 = new Empregado("Joao", "Silva", 5000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 6000.0);

        System.out.println("Salario de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$" + empregado1.getSalarioMensal());
        System.out.println("Salario de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$" + empregado2.getSalarioMensal());

        empregado1.aplicarAumento(10);
        empregado2.aplicarAumento(10);

        System.out.println("Salario anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$" + (empregado1.getSalarioMensal() * 12));
        System.out.println("Salario anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$" + (empregado2.getSalarioMensal() * 12));
    
    }
}
