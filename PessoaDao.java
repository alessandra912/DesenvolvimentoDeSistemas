/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class PessoaDao {
    public void inserir(Pessoa pessoa){
        String sql="INSERT INTO pessoa(nome, idada)Values(?,?)";
        try
            //abre a conexão com o banco
            (connection conn = ConexaoBanco.conectar();
                //prepara o comando sql
                PreparedStatement stmt = conn.prepareStatament(sql)){
            //envia para a primeira ?
            stmt.setString(l,pessoa.getNome());
            //envia para a segunda ?
            stmt.setInt(2,pessoa.getIdade());
            //executa o insert
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Pessoa> listar(){
        
    }
}
