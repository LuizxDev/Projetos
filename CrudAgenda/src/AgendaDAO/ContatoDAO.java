package AgendaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import factory.ConexaoFactory;
import model.Contato;

public class ContatoDAO {
    /*
     * CRUD:
     * c: CREATE - OK - INSERT
     * r: READ - SELECT
     * u: UPDATE - UPDATE
     * d: DELETE - DELETE 
     */

    public void save(Contato contato) {
        String sql = "insert into contatos(nome, idade, dataCadastro) values (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // criar uma conexao com banco de dados
            conn = ConexaoFactory.criarConexaoMySQL();
            // criamos uma pstm para executar uma query
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

            // execulta a query
            pstm.execute();

        } catch (Exception erro) {
            erro.printStackTrace();
        } finally {
            // fechar as conexoes
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception erro) {
                erro.printStackTrace();
            }
        }
    }


    public List<Contato> getContatos(){
        String sql = "SELECT * FROM contatos";

        List<Contato> contatos = new ArrayList<Contato>();

        Connection conn = null;
        PreparedStatement pstm = null;
        
        //classe que recupera os dados do banco
        ResultSet rset = null;

        try {
            conn = ConexaoFactory.criarConexaoMySQL();
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()){
                Contato contato = new Contato();

                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setIdade(rset.getInt("idade"));
                contato.setDataCadastro(rset.getDate("dataCadastro"));

                contatos.add(contato);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
            if(rset != null){
                rset.close();
            }

            if(pstm != null){
                pstm.close();
            }
            if(conn != null){
                conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return contatos;

    }
}
