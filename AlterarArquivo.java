import java.io.FileWriter;
import java.io.IOException;

public class AlterarArquivo {
    public static void main(String[] args) {
        String caminho = "arquivo.txt";

        try{
            FileWriter writer = new FileWriter(caminho);
            writer.write("Conteúdo atualizado!");
            writer.write("Este texto substitui o anterior");

            writer.close();
            System.out.println("Arquivo alterado!.");
        } catch (IOException e) {
            System.out.println("Erro ao alterar o arquivo: " + e.getMessage());
        }
    }
}