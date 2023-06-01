package AgendaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

import factory.ConexaoFactory;
import model.Contato;

public class ContatoDAO {
    /*
     * CRUD
     * c: CREATE
     * r: READ
     * u: UPDATE
     * d: DELETE
     */

    public void save(Contato contato) {
        String sql = "insert into contatos(nome, idade, dataCadastro) value (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // criar uma conexao com banco de dados
            conn = ConexaoFactory.creatConnectionToMysQl();
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
}
