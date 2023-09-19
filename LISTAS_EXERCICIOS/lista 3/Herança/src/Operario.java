public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    
    public Operario() {
    }

    // Construtor com todos os atributos
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getters e setters para atributos específicos
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Sobrescrevendo o método calcularSalario
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario() + (valorProducao * (comissao / 100));
        return salario;
    }
}