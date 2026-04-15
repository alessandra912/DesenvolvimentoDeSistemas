public class Carro extends Veiculo {
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    public double calcularValor() {
        return 15.000;
    }
}