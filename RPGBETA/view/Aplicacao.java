package RPGBETA.view;

import javax.swing.JOptionPane;

import RPGBETA.controller.EfeitoCtrl;
import RPGBETA.controller.controller;

public class Aplicacao {
    public static void main(String[] args) {

        controller ctrl = new controller();
        EfeitoCtrl efeito = new EfeitoCtrl();

        int escolha = Integer
                .parseInt(JOptionPane.showInputDialog("\n|Escolha uma ação| \n|1| Atacar \n|2| Usar Porção" +
                "\n|3| Sair do Jogo"));

        switch (escolha) {
            case 1:
                // ataque
                JOptionPane.showMessageDialog(null, efeito.Ataque());
                break;
            case 2:
                // usar poçao
                JOptionPane.showMessageDialog(null, efeito.Porcao());

                break;
            case 3:
                break;
            // sair do jogo
            default:
                break;
        }

        ctrl.IniciarJogo(escolha);

    }
}
