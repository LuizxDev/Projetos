import javax.swing.JOptionPane;
import java.util.Random;
public class QuebraSenha {

    Random random = new Random();
    
    String password = JOptionPane.showInputDialog("Digite uma senha");

    int tamanhoSenha = password.length();
    String combinacoes = "";
    String letras = "abcdefghijklmnopqrstuvwxyzrABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*-_";
    

    public void quebra (){

        while (!combinacoes.equals(password)) {
            combinacoes = "";
            for (int i = 0; i < tamanhoSenha; i++) {

                int indice = random.nextInt(letras.length());
                
                combinacoes += letras.charAt(indice);
                    //System.out.println(combinacoes);
                
                if (combinacoes.equals(password)){
                    JOptionPane.showMessageDialog(null,"A senha é: " + combinacoes);

            }
        
    }


        }

    }
}