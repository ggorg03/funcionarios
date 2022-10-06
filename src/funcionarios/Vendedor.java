package funcionarios;

public class Vendedor extends Funcionario {
	
	private double comissao;

	public Vendedor() {
		// Construtor vazio
		super();
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salario + comissao;
	}
}
