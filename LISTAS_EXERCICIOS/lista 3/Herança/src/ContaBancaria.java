class ContaBancaria {
    private final String cliente;
    private final int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}