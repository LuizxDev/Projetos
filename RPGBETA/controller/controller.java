package RPGBETA.controller;

import RPGBETA.model.Heroi;
import RPGBETA.model.Inimigo;
import RPGBETA.view.Aplicacao;

public class controller {

    Heroi heroi = new Heroi();
    Inimigo inimigo= new Inimigo();

    private int opcao;

    
    
    public void IniciarJogo(int escolha){

    Aplicacao app = new Aplicacao();


        do {

            app.opcao();
            
            switch (escolha){
                case 1:
                    
                    heroi.ataque(inimigo);
                    inimigo.status(inimigo);
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

        } while (heroi.estaVivo() && inimigo.estaVivo() && escolha != 3);
    }


    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

}
