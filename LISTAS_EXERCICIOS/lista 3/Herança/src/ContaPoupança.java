class ContaPoupanca extends ContaBancaria {
    private final int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        if (diaRendimento == java.time.LocalDate.now().getDayOfMonth()) {
            double rendimento = getSaldo() * taxaRendimento;
            depositar(rendimento);
        }
    }
}
