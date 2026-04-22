import java.io.FileWriter;

public class Ex02 {
    public static void main(String[] args) {

        try{
            FileWriter escritor = new FileWriter("Exemplo.txt", true);
            escritor.write("\nprimeira linha");
            escritor.write("\nsegunda linha");
            escritor.close();
            System.out.println("Escrita concluída.");
        } catch (Exception e){
            System.out.println("Erro ao escrever");
            e.printStackTrace();
        } 
    }
}