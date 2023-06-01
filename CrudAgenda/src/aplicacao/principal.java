package aplicacao;

import model.Contato;
import java.util.Date;

import AgendaDAO.ContatoDAO;

public class principal {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("ola");
        contato.setIdade(55);
        contato.setDataCadastro(new Date());

        ContatoDAO contatoDAO = new ContatoDAO();

        contatoDAO.save(contato);

    }
}
