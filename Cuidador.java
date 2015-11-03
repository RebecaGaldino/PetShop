package PetShop;

public class Cuidador extends Pessoa {
	private double salario;
	
	public Cuidador(String nome, String cpf, String id, double salario) throws Exception {
		super(nome,cpf,id);
		setSalario(salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws Exception {
		if (salario > 0)
			this.salario = salario;
		else
			throw new Exception("Insira um salario valido");
	}
	  
	
	
	@Override
	public String toString(){
		return (super.toString()+" SALARIO : \n"+ getSalario());
	}
}
