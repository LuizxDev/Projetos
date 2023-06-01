package rpg;
import javax.swing.JOptionPane;
public class Personage {

    public static final String heart = "\u2764"; //EMOJI DE CORAÇAO
    
    private String name;
    private int vida = 100;
    private int danoAtaque = 10;

    public void status(int vida, String nome){

        JOptionPane.showMessageDialog(null,
        "\nStatus" + 
        "\nNome: " + nome + "\n" + heart + "Vida: " + vida);
        }

    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
  
    public int getVida() {
        return vida;
    }
  
    public void setVida(int vida) {
        this.vida = vida;
    }
   
    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

}