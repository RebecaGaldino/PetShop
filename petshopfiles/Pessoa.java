package petshopfiles;

public class Pessoa {
	private String nome;
	private String cpf;
	private String id; 
	
	
    /**
     * Construtor da super classe Pessoa
     * @param nome
     * @param cpf
     * @param id
     * @throws Exception
     */
	public Pessoa(String nome, String cpf, String id) throws Exception {
		setNome(nome);
		setCpf(cpf);
		setId(id);
	}

	/*------------------------------Getters e setters-----------------------------------------------*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*-----------------------------------------------------------------------------*/

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if(cpf.length() == 14)
			this.cpf = cpf;
		else
			throw new Exception("Quantidade invalida de caracteres!");
	}
	
	/*-----------------------------------------------------------------------------*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/*--------------------------Método toString---------------------------------------------------*/

	public String toString(){
		return "Nome: " + getNome() +
				"CPF: " + getCpf() +
				"ID: " + getId() + "\n";
	}
   
	/*----------------------------Equals-------------------------------------------------*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}

