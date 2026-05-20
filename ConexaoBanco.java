/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class ConexaoBanco {
    private static final String url="";
    private static final String user="root";
    private static final String senha="";
    
    //Método responsável pela conexão
    pyblic static Connection conectar(){
        try{
            //Retorna conexão com banco utilizando url, usuário e senha
            return DriverManager.getConnection(url,user,senha);
        }catch(SQLException e){
            //caso aconteça erro, lança exceção personalizada
            throw new RuntimeException("Erro na conexão com o banco de dados: ")
                    +e.getMessage
        }
    }
    
}
