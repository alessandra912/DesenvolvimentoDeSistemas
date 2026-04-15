public class Moto extends Veiculo {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    public double calcularValor() {
        return 30.000;
    }
}