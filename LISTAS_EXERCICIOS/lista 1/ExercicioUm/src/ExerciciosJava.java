import java.util.Scanner;

public class ExerciciosJava {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Exercício 1
        System.out.println("Exercicio 1");
        String pessoaMaisVelha = "";
        String pessoaMaisNova = "";
        int idadeMaisVelha = Integer.MIN_VALUE;
        int idadeMaisNova = Integer.MAX_VALUE;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                pessoaMaisVelha = nome;
            }
            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                pessoaMaisNova = nome;
            }
        }
        
        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
        System.out.println("Pessoa mais nova: " + pessoaMaisNova);
        
        // Exercício 2
        System.out.println("\nExercicio 2");
        System.out.print("Digite o saldo medio do cliente: ");
        double saldoMedio = scanner.nextDouble();
        double valorCredito = 0.0;
        int saldoInt = (int) saldoMedio;
        double percentualCredito = 0.0;
        
        //System.out.println("opção de saldoInt:  " + saldoInt/200);
        switch(saldoInt){  
            case 200:
                    // caso unico 200 atribuido para salario medio
                    percentualCredito = 0.0;
                    break;
                    
            case 400:
                    // caso unico 400 atribuido para salario medio
                    percentualCredito = 0.2;
                    break;
                    
            case 600:
                    // caso unico 600 atribuido para salario medio
                    percentualCredito = 0.3;
                    break;
                    
            default:
                switch (saldoInt / 200){
                    case 0:
                        // 0 a 199 atribuido para salario medio
                        percentualCredito = 0.0;
                        break;
                    case 1:
                        //201 a 399 atribuido para salario medio
                        percentualCredito =  0.2;
                        break;
                    
                    case 2:
                        //401 a 599 atribuido para salario medio
                        percentualCredito =  0.3;
                        break;
                    
                    default:
                        //601+ atribuido para salario medio
                        percentualCredito = 0.4;
                        break;
                }
            break;
        }
           
        System.out.format("Valor do percentual atribuido foi: %.1f", (percentualCredito));
        
        valorCredito = saldoMedio * percentualCredito;
        
        System.out.println("Saldo medio: " + saldoMedio);
        System.out.println("Valor do credito: " + valorCredito);
                
        // Exercício 3
        System.out.println("\nExercicio 3");
        int somaImpares = 0;
        int multiplicacaoPares = 1;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                multiplicacaoPares *= i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos impares: " + somaImpares);
        System.out.println("Multiplicacao dos pares: " + multiplicacaoPares);

        // Exercício 4
        System.out.println("\nExercicio 4");
        TrocaNumero.trocarNumeros(5, 9);

        // Exercício 5
        System.out.println("\nExercicio 5");
        ComparaNumero.compararNumeros(5, 9);

        // Exercício 6 e 7
        System.out.println("\nExercicio 6 e 7");
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setProprietario("Joao");
        veiculo1.setAno(2022);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setProprietario("Maria");
        veiculo2.setAno(2020);

        Empregado empregado1 = new Empregado();
        empregado1.setNome("Carlos");
        empregado1.setMatricula("123");
        empregado1.setIdade(30);
        empregado1.setSalario(3000.0);

        Empregado empregado2 = new Empregado();
        empregado2.setNome("Ana");
        empregado2.setMatricula("456");
        empregado2.setIdade(25);
        empregado2.setSalario(2500.0);

        System.out.println("Veiculo 1: " + veiculo1.getProprietario() + ", Ano: " + veiculo1.getAno());
        System.out.println("Veiculo 2: " + veiculo2.getProprietario() + ", Ano: " + veiculo2.getAno());
        System.out.println("Empregado 1: " + empregado1.getNome() + ", Matricula: " + empregado1.getMatricula() + ", Salário: " + empregado1.getSalario());
        System.out.println("Empregado 2: " + empregado2.getNome() + ", Matricula: " + empregado2.getMatricula() + ", Salário: " + empregado2.getSalario());

        // Exercício 8
        System.out.println("\nExercicio 8");
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setModelo("Fiat");
        veiculo3.setPeso(1600);
        veiculo3.setVelocMax(180);
        veiculo3.setPreco(45000.0);

        Veiculo veiculo4 = new Veiculo();
        veiculo4.setModelo("Volkswagen");
        veiculo4.setPeso(1400);
        veiculo4.setVelocMax(200);
        veiculo4.setPreco(55000.0);

        veiculo3.imprimirDados();
        veiculo4.imprimirDados();

        // Exercício 9
        System.out.println("\nExercicio 9");
        Empregado empregado3 = new Empregado();
        empregado3.setNome("Pedro");
        empregado3.setSobrenome("Silva");
        empregado3.setSalario(3000.0);

        Empregado empregado4 = new Empregado();
        empregado4.setNome("Luis");
        empregado4.setSobrenome("Pereira");
        empregado4.setSalario(3500.0);

        System.out.println("Salario de Empregado 3: " + empregado3.getSalario());
        System.out.println("Salario de Empregado 4: " + empregado4.getSalario());

        empregado3.aumentaSalario(10);
        empregado4.aumentaSalario(10);

        System.out.println("Novo salario de Empregado 3: " + empregado3.getSalario());
        System.out.println("Novo salario de Empregado 4: " + empregado4.getSalario());

        // Exercício 10
        System.out.println("\nExercicio 10");
        Retangulo retangulo1 = new Retangulo();
        retangulo1.setLargura(5.0);
        retangulo1.setAltura(10.0);

        System.out.println("Perimetro do retangulo: " + retangulo1.perimetro());
        System.out.println("Area do retangulo: " + retangulo1.area());
        };
}

 

 

 
 

 