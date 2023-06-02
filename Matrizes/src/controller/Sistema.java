package controller;
import javax.swing.JOptionPane;
import java.util.Random;
public class Sistema {

    Random aleatorio = new Random();

    
    
    private int matriz [][] = new int[3][3];

    public void trezXtrez() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(25);
            }
        }
    }
    

    public void gerarMatrizTrezTrez(){
        JOptionPane.showMessageDialog(null, 
        "\n|" +matriz[0][0] +"  "+ matriz[0][1] +"  "+ matriz[0][2] + "|" +
        "\n|" +matriz[1][0] +"  "+ matriz[1][1] +"  "+ matriz[1][2] + "|" +
        "\n|" +matriz[2][0] +"  "+ matriz[2][1] +"  "+ matriz[2][2] + "|");
    }

}
