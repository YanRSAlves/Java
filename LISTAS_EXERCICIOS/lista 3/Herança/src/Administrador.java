public class Administrador extends Empregado {
    private double ajudaDeCusto;

    
    public Administrador() {
    }

    // Construtor com todos os atributos
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getters e setters para atributos específicos
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Sobrescrevendo o método calcularSalario
    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario() + ajudaDeCusto;
        return salario;
    }
}
