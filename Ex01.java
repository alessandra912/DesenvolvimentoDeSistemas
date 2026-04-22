import java.io.IOException;
import java.io.File;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
            try{
                File arquivo = new File("Exemplo.txt");
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado: " + arquivo.getName());
                } else {
                    System.out.println("Arquivo já existe.");
                }
            } catch (IOException e){
                System.out.println("Ocorreu um erro ao criar o arquivo.");
                e.printStackTrace();
        }
    }
}