/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class ContaBancariaObj {

	public int numeroConta;
	public String nome;
	public double saldo;

	public ContaBancariaObj(int numeroConta, String nome, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void ContaBancaria() {
		System.out.println("Conta #" + numeroConta + " | Titular: " + nome + " | Saldo: R$" + saldo);
	}

	public void realizaDeposito(double deposito) {
		saldo += deposito;
		JOptionPane.showMessageDialog(null, "Deposito de R$ " + deposito + " realizado com sucesso!");
	}

	public void realizaSaque(double saque) {
		if (saque > saldo) {
			JOptionPane.showMessageDialog(null, "Não há saldo o suficiente para o saque! Operação abortada!");
		} else {
			saldo -= saque;
			JOptionPane.showMessageDialog(null, "Saque de R$ " + saque + " realizado com sucesso!");
		}
	
	}
}
