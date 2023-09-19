class ContaEspecial extends ContaBancaria {
    private final double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            super.sacar(valor);
        } else {
            System.out.println("Limite de credito excedido");
        }
    }
}
