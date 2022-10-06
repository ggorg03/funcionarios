package funcionarios;

public class Funcionario {

	static private int registradorID;
	// inicializando o contador de ID
	static {
		Funcionario.registradorID = 0;
	}
	
	protected int id;
	protected double salario;
	protected String tipoFuncionario;
	
	public Funcionario() {
		// Construtor vazio
		registradorID++;
		this.id = registradorID;
	}
	
	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public double calcularSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return this.getTipoFuncionario() + "[id=" + id + " salario=" + salario + ", tipoFuncionario=" + tipoFuncionario + "]";
	}
}
