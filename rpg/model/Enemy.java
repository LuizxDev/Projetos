package rpg.model;
import javax.swing.JOptionPane;

import rpg.controller.Sistema;

public class Enemy extends Sistema {


    public Enemy(){
        
        this.setName("Argos");
        
    }

    public void status(int vida, String nome){

        JOptionPane.showMessageDialog(null,
        "\nStatus Do Inimigo" + 
        "\nNome: " + nome + "\nVida: " + vida);
        }

    public boolean estaVivo() {
        return this.getVida() > 0;
    }
}
