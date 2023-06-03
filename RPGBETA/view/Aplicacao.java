package RPGBETA.view;

import javax.swing.JOptionPane;

import RPGBETA.controller.controller;

public class Aplicacao {
    public static void main(String[] args) {

        controller ctrl = new controller();

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("\n|Escolha uma ação| \n|1| Atacar \n|2| Usar Porção" +
        "\n|3| Sair do Jogo"));

        ctrl.IniciarJogo(escolha);

        switch (escolha) {
            case 1:
                
                break;
            case 2:
            //usar poçao
            JOptionPane.showMessageDialog(null, "Após tomar a poção com coragem, seu personagem sente um poder revitalizante \npercorrer suas veias, renovando sua força e determinação.");

                break;
            case 3:
                break;
        
            default:
                break;
        }
      
    }
}
