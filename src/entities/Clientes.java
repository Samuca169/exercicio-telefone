package entities;

public class Clientes {

	private String nome;
	private Integer telefone;
	private Integer tipo;
	private Integer minutos;
	private Double valorDaConta;
	
	 public Clientes() {
	 }

	public Clientes(String nome, Integer telefone, Integer tipo, Integer minutos, Double valorDaConta) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.tipo = tipo;
		this.minutos = minutos;
		this.valorDaConta = valorDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Double getValorDaConta() {
		return valorDaConta;
	}

	public void setValorDaConta(Double valorDaConta) {
		this.valorDaConta = valorDaConta;
	}
}
