package rpg.model;

import javax.swing.JOptionPane;

import rpg.controller.Sistema;

public class Heroi extends Sistema {

    private final int porcao = 10;

    Enemy inimigo = new Enemy();

    public Heroi() {

            //classe view
        this.setName(JOptionPane.showInputDialog("Digite o nome do seu Heroi "));

        JOptionPane.showInternalMessageDialog(null, "Ola " +
                this.getName()
                + " Bem-vindo(a) ao mundo mágico e cheio de aventuras do nosso RPG! \nAqui, você encontrará um universo repleto de desafios, mistérios e heróis \ndestemidos como você. Prepare-se para embarcar em uma jornada épica, \nonde sua imaginação e estratégia serão suas maiores armas.");

        JOptionPane.showInternalMessageDialog(null, "Bem a sua frente apareceu um monstro ");

        this.setVida(100); // vida do heroi
        this.setDanoAtaque(10); // dano de ataque

    }

    public void status(int vida, String nome) {

        JOptionPane.showMessageDialog(null,
                "\nSeus Status" +
                        "\nNome: " + nome + "\nVida: " + vida);
    }

    public int usarPorçao() {

        this.setVida(this.getVida() + porcao);

        if (this.getVida() >= 100) {
            this.setVida(100);
        }
        return this.getVida();
    }

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

}
