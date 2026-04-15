public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);

    System.out.println("Salário Total R$: " + calcularSalario());

        if(comissao < 0){
            throw new IllegalArgumentException("Comissão não pode ser negativa.");
        }

        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}