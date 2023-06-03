package RPGBETA.controller;

import RPGBETA.model.Heroi;
import RPGBETA.model.Inimigo;

public class controller {

    Heroi heroi = new Heroi();
    Inimigo inimigo= new Inimigo();
    
    public void IniciarJogo(int escolha){



        do {

            switch (escolha){
                case 1:
                    
                    heroi.ataque(inimigo);
                    //ataque
                break;
                case 2:
                    heroi.usarPorcao(heroi);
                    //porçao
                break;
                case 3:
                    //sair do jogo
                break;
            }

        } while (heroi.estaVivo() && inimigo.estaVivo());
    }
}
