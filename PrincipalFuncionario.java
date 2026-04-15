import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> lista =  new ArrayList<>();

        int escolha = 0;

        try{
            System.out.println("\n== Cadastro de Funcionários ==");
            System.out.println("1 - Vendedor");
            System.out.println("2 - Gerente");
            System.out.println("Escolha o funcionário que deseja cadastrar: ");

            escolha = sc.nextInt();
            sc.nextLine();

            System.out.println("--------------------------");

            if (escolha == 1) {
                System.out.println("\n>>>> Cadastro de Vendedor");

                System.out.println("\nNome do vendedor: ");
                String nomeVendedor = sc.nextLine();

                System.out.println("Salário base do vendedor: ");
                double salarioBaseVendedor = sc.nextDouble();

                System.out.println("Comissão: ");
                double comissaoVendedor = sc.nextDouble();
                sc.nextLine();

                lista.add(new Vendedor(nomeVendedor, salarioBaseVendedor, comissaoVendedor));

                System.out.println("Vendedor cadastrado com sucesso!");

            } else if (escolha == 2) {
                System.out.println("\n>>>> Cadastro de Gerente");

                System.out.println("\nNome do gerente: ");
                String nomeGerente = sc.nextLine();

                System.out.println("Salário base do gerente: ");
                double salarioBaseGerente = sc.nextDouble();
                sc.nextLine();

                lista.add(new Gerente(nomeGerente, salarioBaseGerente, 2000));

                System.out.println("Gerente cadastrado com sucesso!");

            } else {
                System.out.println("Opção inválida!");
            }

        
        }catch(InputMismatchException e){
            System.out.println("Erro: digite um número válido.");
        }

        System.out.println("\n== Lista de Funcionários ==");
        for(Funcionario f : lista){
            f.exibir();
            System.out.println("-------------------------");
        }

        sc.close();
    }
}