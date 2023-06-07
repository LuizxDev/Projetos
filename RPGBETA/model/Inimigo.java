package RPGBETA.model;

import javax.swing.JOptionPane;

public class Inimigo extends Personagens {

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

    public int ataque(Heroi heroi){
        heroi.setVida(getVida() - this.getDanoAtaque());
        return heroi.getVida();
    }

    public void status(Inimigo inimigo){
        
        JOptionPane.showMessageDialog(null,
        "\nStatus Do Inimigo" + 
        "\nNome: " + inimigo.getNome() + "\nVida: " + inimigo.getVida());
        
    }

}


