package rpg;
import java.util.Random;

import javax.swing.JOptionPane;

import rpg.controller.Sistema;
import rpg.model.Enemy;
import rpg.model.Heroi;

public class Principal extends Sistema {

    public static void main(String[] args) {

        Random aleatorio = new Random();
       
        Sistema sistema = new Sistema();
        Heroi heroi = new Heroi();
        Enemy inimigo = new Enemy();

        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\n|Escolha uma ação| \n|1| Atacar \n|2| Curar" +
            "\n|3| Sair do Jogo"));

            int indiceDano = aleatorio.nextInt(sistema.efeitoDano.length);
            int indiceAtaque = aleatorio.nextInt(sistema.efeitoAtaque.length);

    
            switch (opcao) { 
                case 1:
                    inimigo.setVida(inimigo.getVida() - heroi.getDanoAtaque());
                    JOptionPane.showMessageDialog(null, sistema.efeitoAtaque[indiceAtaque]);

                    inimigo.status(inimigo.getVida(), inimigo.getName()); 
                        
                    JOptionPane.showMessageDialog(null, sistema.efeitoDano[indiceDano]);
        
                    heroi.setVida(heroi.getVida() - inimigo.getDanoAtaque());
        
                    JOptionPane.showMessageDialog(null, "Voce Perdeu " + heroi.getDanoAtaque() + heart + "De Vida");
        
                    heroi.status(heroi.getVida(), heroi.getName());
                         break;
                    case 2:
                        heroi.usarPorçao();
                        JOptionPane.showMessageDialog(null, "Após tomar a poção com coragem, seu personagem sente um poder revitalizante \npercorrer suas veias, renovando sua força e determinação.");
                        
                        heroi.status(heroi.getVida(), heroi.getName());
                            break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Aperte em OK para sair do Jogo");
                            break;
                    default:
                        break;
                }
         
            JOptionPane.showMessageDialog(null, "Rodada Finalizada");
            
        }while(heroi.estaVivo() && inimigo.estaVivo() && opcao != 3);
    }      


    }
