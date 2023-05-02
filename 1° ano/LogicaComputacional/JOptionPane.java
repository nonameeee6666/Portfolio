Código feito em sala:


package bofao;

import javax.swing.JOptionPane;


public class Bofao {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo, "+nome);
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        String msg = "Que legal "+nome+", você tem "+idade+" anos.";
        JOptionPane.showMessageDialog(null, msg);
        String r1 = JOptionPane.showInputDialog("Qual o contrário de papelada?");
        if(r1.equals("pavestida")){
            JOptionPane.showMessageDialog(null, "Acertou!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Errou!");
        }
    }
    
}
