import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        try{
            File arquivo = new File("Exemplo.x");
            Scanner sc = new Scanner(arquivo);

            while(sc.hasNext()){
                String linha = sc.nextLine();
                System.out.println(linha);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }
    }
}