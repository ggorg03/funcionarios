package funcionarios;

import java.util.List;
import java.util.ArrayList;

public class EmpresaView {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setTipoFuncionario("Engenheiro");
		f.setSalario(4500.50);
		f.calcularSalario();
		
		Vendedor v = new Vendedor();
		v.setTipoFuncionario("Vendedor");
		v.setSalario(1500.00);
		v.setComissao(500.00);
		v.calcularSalario();
		
		Gerente g = new Gerente();
		g.setTipoFuncionario("Gerente");
		g.setSalario(7500.00);
		g.setBonus(2000.00);
		g.calcularSalario();
		
		// adicionando funcionários no arraylist de funcionários
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f);
		funcionarios.add(v);
		funcionarios.add(g);
		
		listarFuncionarios(funcionarios);
		
		ajustarSalarios(funcionarios);
		
		listarFuncionarios(funcionarios);
	}
	

	/**
	 * Lista os funcionários na tela
	*/
	public static void listarFuncionarios(List<Funcionario> funcionarios) {
		int width = 70;
		
		System.out.println("#".repeat(width));
		System.out.println("Funcionarios");
		System.out.println("-".repeat(width));
		
		for(Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
		System.out.println("-".repeat(width));
	}
	
	/**
	 * Ajusta o salários dos funcionários
	 */
	public static void ajustarSalarios(List<Funcionario> funcionarios) {
		for(Funcionario funcionario : funcionarios) {
			if(funcionario instanceof Vendedor) {
				funcionario.setSalario(funcionario.getSalario() * 1.1);
				((Vendedor) funcionario).setComissao(((Vendedor) funcionario).getComissao() + 200.0);
			}
			else if (funcionario instanceof Gerente) {
				funcionario.setSalario(funcionario.getSalario() * 1.2);
				((Gerente) funcionario).setBonus(((Gerente) funcionario).getBonus() + 100.0);
			}
			else {
				funcionario.setSalario(funcionario.getSalario() * 1.25);
			}
		}
	}
}
