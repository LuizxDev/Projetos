package RPGBETA.view;

import javax.swing.JOptionPane;

import RPGBETA.controller.controller;

public class Aplicacao {
    public static void main(String[] args) {

        controller ctrl = new controller();

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("\n|Escolha uma ação| \n|1| Atacar \n|2| Curar" +
        "\n|3| Sair do Jogo"));

        ctrl.IniciarJogo(escolha);
      
    }
}
