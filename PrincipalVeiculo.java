import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class PrincipalVeiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Veiculo> lista =  new ArrayList<>();

        try{
            System.out.println("Digite o modelo do carro:");
            String modelo = sc.nextLine();

            System.out.println("Digite o ano do carro:");
            int ano = sc.nextInt();
            lista.add(new Carro(modelo, ano));

            System.out.println("Adicionado com sucesso!");

        }catch(InputMismatchException e){
            System.out.println("Erro: Por favor, digite um número válido para o ano.");
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

        for(Veiculo v : lista){
            v.exibir();
        }

        sc.close();
    }
}