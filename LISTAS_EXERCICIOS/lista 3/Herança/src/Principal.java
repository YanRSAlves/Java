
public class Principal {
    public class Main {
    public static void main(String[] args) {
        //1 - 6 Questoes Herança
        // Criar um objeto Fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "Endereço 1", "123456789", 10000, 5000);

        // Testar o método obterSaldo
        double saldoFornecedor = fornecedor.obterSaldo();
        System.out.println("Saldo do Fornecedor: " + saldoFornecedor);

        // Criar um objeto Administrador
        Administrador administrador = new Administrador("Administrador 1", "Endereço 2", "987654321", 1, 5000, 10, 1000);

        // Testar o método calcularSalario
        double salarioAdministrador = administrador.calcularSalario();
        System.out.println("Salario do Administrador: " + salarioAdministrador);

        // Criar um objeto Operario
        Operario operario = new Operario("Operario 1", "Endereço 3", "111111111", 2, 3000, 5, 5000, 2);

        // Testar o método calcularSalario
        double salarioOperario = operario.calcularSalario();
        System.out.println("Salario do Operario: " + salarioOperario);

        // Criar um objeto Vendedor
        Vendedor vendedor = new Vendedor("Vendedor 1", "Endereço 4", "222222222", 3, 2500, 5, 10000, 3);

        // Testar o método calcularSalario
        double salarioVendedor = vendedor.calcularSalario();
        System.out.println("Salario do Vendedor: " + salarioVendedor);
        
        
        
        
        
        
        //Exercício 7
        ContaPoupanca poupanca = new ContaPoupanca("Joao", 123, 1000.0, 5);
        ContaEspecial especial = new ContaEspecial("Maria", 456, 1500.0, 500.0);

        // Depositar dinheiro nas contas
        poupanca.depositar(500.0);
        especial.depositar(300.0);

        // Sacar dinheiro das contas
        poupanca.sacar(200.0);
        especial.sacar(2000.0);

        // Calcular novo saldo da conta poupança com taxa de rendimento
        poupanca.calcularNovoSaldo(0.03); // Taxa de rendimento de 3%

        // Mostrar os dados das contas
        poupanca.mostrarDados();
        especial.mostrarDados();
    }
}
}
