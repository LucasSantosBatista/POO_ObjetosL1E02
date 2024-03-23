/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.ContaBancariaObj;

/**
 * @author Lucas Batista
 * 23 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		int numeroConta = (int) ((Math.random() * 10 ) + 1);
		ContaBancariaObj conta = new ContaBancariaObj(numeroConta, "Lucas", 10000);
		
		Object[] options = {"Exibir conta", "Realiza depósito", "Realiza saque", "Encerra"};
		int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha o que deseja fazer:", "Sistema Conta Bancária",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);


            switch (opcao) {
                case 0:
                    conta.ContaBancaria();
                    break;
                case 1:
                    double deposito = 0;
 	
                	deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite quanto deseja depositar: "));
                	conta.realizaDeposito(deposito);
                    break;
                case 2:
                	double saque = 0;
                 	
                	saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite quanto deseja depositar: "));
                	conta.realizaSaque(saque);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
            }
        } while (opcao != 3);
    }

}
