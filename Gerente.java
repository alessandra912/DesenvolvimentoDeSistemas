public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
    
    System.out.println("Salário Total / Salário Base + comissão R$: " + calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000;
    }
}