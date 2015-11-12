package PetShop;


public class Cliente extends Pessoa {
	private double conta;
	
	/**@see
	 * Construtor sem par�metros,que p�e valores default
	 * */
	public Cliente(String nome, String cpf, String id) throws Exception {
		super(nome,cpf,id);
	}
	/*------------ GETTERS E SETTERS ---------------*/
	
	public void setConta(double conta) {
		this.conta = conta;
	}

	public double getConta() {
		return this.conta;
	}
	/**@see
	 * Implementa o valor da conta de acordo com o valor do servi�o realizado
	 * */
	public void valorConta(double valor){
		conta += valor;
	}
	
	
	@Override
	public String toString(){
		return (super.toString()+"CONTA : \n"+ getConta() + "\n ------------- \n");
	}
	
	
}
