package Servicos;

import Entidades.Pessoa;

public class AuxilioEmergencial {

	private Pessoa pessoa;

	public AuxilioEmergencial(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void captarAuxilio() {
		
		if (pessoa.getIdade() < 18) {
			System.out.println("Pessoas menores de idade n�o podem captar aux�lio");
		} else if (pessoa.getEmpregado().contains("S")) {
			System.out.println("Pessoas empregadas n�o podem captar aux�lio");
		} else {
			if (pessoa.getGenero().contains("F") && pessoa.getQuantidadeFilhos() > 0) {
				System.out.println(pessoa.getNome() + " Pode captar um aux�lio de at� $1.200 reais");
			} else {
				System.out.println(pessoa.getNome() + " Pode captar um aux�lio de at� $600 reais");

			}
		}
	}
}
