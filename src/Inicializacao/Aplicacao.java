package Inicializacao;

import java.util.Scanner;

import Entidades.Pessoa;
import Servicos.AuxilioEmergencial;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Entre com os dados da Pessoa: ");
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			
			System.out.print("Gênero: (M/F)");
			String sexo = sc.next().toUpperCase();
			
			System.out.print("Empregado ? (S/N): ");
			String empregado = sc.next().toUpperCase();
			
			System.out.print("Possuí Filhos ? (S/N): ");
			String filhos = sc.next().toUpperCase();
			
			Integer qtdFilhos = 0;
			
			if (filhos.contains("S")) {
				System.out.println("Quantos filhos possuí: ");
				qtdFilhos = sc.nextInt();
			}
			
			Pessoa p  = new Pessoa(1, nome, idade, empregado, sexo, qtdFilhos);
			
			AuxilioEmergencial servico = new AuxilioEmergencial(p);
			
			servico.captarAuxilio();
		}  catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
