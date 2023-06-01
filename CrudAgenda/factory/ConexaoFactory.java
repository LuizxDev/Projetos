package CrudAgenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    private static final String USERNAME = "root";

    private static final String PASSWORD = "";

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    public static Connection creatConnectionToMysQl() throws Exception {
        // faz com que classe seja carregada pela jvm
        Class.forName("com.mysql.jdbc.Driver");

        // cria a conexao com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {

        Connection con = creatConnectionToMysQl();

        if (con != null) {
            System.out.println("Conexao obtida com sucesso");
            con.close();
        }

    }

}
