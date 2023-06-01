import javax.swing.JOptionPane;
public class App{   
    public static void main(String[] args) {

        Sistema matriz = new Sistema();
        
        int opcao;

        do{

        opcao = Integer.parseInt(JOptionPane.showInputDialog("|1| gerar matriz \nSair do sistema"));

        switch (opcao){
            case 1:
                matriz.trezXtrez();
                matriz.mostrarMatrizTrezTrez();
            break;

            case 2:
                break;
        }
       
        }while(opcao == 1);

        

    }
}
