package Entidades;

public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;
	private String empregado;
	private String genero;
	private Integer quantidadeFilhos;

	public Pessoa(Integer id, String nome, Integer idade, 
			String empregado, String genero, Integer quantidadeFilhos) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.empregado = empregado;
		this.genero = genero;
		this.quantidadeFilhos = quantidadeFilhos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmpregado() {
		return empregado;
	}

	public void setEmpregado(String empregado) {
		this.empregado = empregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getQuantidadeFilhos() {
		return quantidadeFilhos;
	}

	public void setQuantidadeFilhos(Integer quantidadeFilhos) {
		this.quantidadeFilhos = quantidadeFilhos;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" 
				+ idade + ", empregado=" + empregado + ", genero="
				+ genero + ", quantidadeFilhos=" + quantidadeFilhos + "]";
	}
	
	

}
