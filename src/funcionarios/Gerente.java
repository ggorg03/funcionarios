package funcionarios;

public class Gerente extends Funcionario {

	private double bonus;
	
	public Gerente() {
		// Construtor vazio
		super();
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return this.salario + bonus;
	}
}
