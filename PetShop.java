package PetShop;

import java.util.*;



public class PetShop {
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Animal> animais = new ArrayList<Animal>();;
	ArrayList<Cuidador> cuidadores = new ArrayList<Cuidador>();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	/**
	 * Construtor vazio da classe PetShop, para iniciá-la.
	 */
	public PetShop(){
		
	}
	
	/*               MÉTODOS -  DADOS CLIENTE                        */
	
	public Cliente getClientes(int index){
		return clientes.get(index);
	}
	
	/*--------------------------------------------------------------*/
	
	public void exibirClientes() throws Exception{
		if (!clientes.isEmpty())
	    	for (int i=0; i < clientes.size(); i++){
	    		System.out.println(clientes.get(i) + "\n");
	    	}
	    else
	    	throw new Exception ("Nao ha clientes registrados.");
	}

	
	/*--------------------------------------------------------------*/

	public boolean findCliente(String id){
		for(int p = 0; p < clientes.size(); p++){
			if(clientes.get(p).getId().equals(id))
				return true;
		
		}
		return false;
	}
	
	/*--------------------------------------------------------------*/
	public Cliente findCliente(String id, PetShop p){
		for (int i = 0; i<clientes.size(); i++) {
			if (clientes.get(i).getId().equals(id)){
				return clientes.get(i);
			}
		}
		return null;
	}
	
	/*--------------------------------------------------------------*/
	public void addCliente(Cliente c) throws Exception{
		if(findCliente(c.getId())){
			throw new Exception("Esse cliente já está registrado!");
		} else
			clientes.add(c);
	}
	
	/*--------------------------------------------------------------*/

	public void removerCliente(String id){
		for(int i = 0; i < clientes.size(); i++){
			if(clientes.get(i).getId() == id){
				clientes.remove(i);
			}
		}
	}
	
/*                  MÉTODOS - ANIMAIS                        */
	
	public Animal getAnimais(int index){
		return animais.get(index);
	}
	
	/*--------------------------------------------------------------*/
	
	public void exibirAnimais() throws Exception{
		if (!animais.isEmpty())
	    	for (int i=0; i < animais.size(); i++){
	    		System.out.println(animais.get(i) + "\n");
	    	}
	    else
	    	throw new Exception ("Nao ha animais registrados.");
	}

	
	/*--------------------------------------------------------------*/

	public boolean findAnimal(String cod){
		for(int p = 0; p < animais.size(); p++){
			if(cod.equals(animais.get(p).getCod()))
				return true;
		
		}
		return false;
	}
	
	/*--------------------------------------------------------------*/

	public void addAnimal(Animal a) throws Exception{
		if(findAnimal(a.getCod())){
			throw new Exception("Esse animal já está registrado!");
		} else {
			if(findCuidador(a.getIdCuidador()) && findCliente(a.getCodClienteResponsavel()))
				animais.add(a);
		}
	}
	
	/*--------------------------------------------------------------*/

	public void removerAnimal(String id){
		for(int i = 0; i < animais.size(); i++){
			if(animais.get(i).getCod() == id){
				animais.remove(i);
			}
		}
	}
	
/*                MÉTODOS  - CUIDADORES                      */
	
	public Cuidador getCuidadores(int index){
		return cuidadores.get(index);
	}
	
	/*--------------------------------------------------------------*/
	
	public void exibirCuidadores() throws Exception{
		if (!cuidadores.isEmpty())
	    	for (int i=0; i < cuidadores.size(); i++){
	    		System.out.println(cuidadores.get(i) + "\n");
	    	}
	    else
	    	throw new Exception ("Nao ha cuidadores registrados.");
	}

	
	/*--------------------------------------------------------------*/

	public boolean findCuidador(String id){
		for(int i = 0; i < cuidadores.size(); i++){
			if(cuidadores.get(i).getId().equals(id))
				return true;
		
		}
		return false;
	}
	
	/*--------------------------------------------------------------*/

	public void addCuidador(Cuidador c) throws Exception{
		if(findCuidador(c.getId())){
			throw new Exception("Esse cliente já está registrado!");
		} else
			cuidadores.add(c);
	}
	
	/*--------------------------------------------------------------*/

	public void removerCuidador(String id){
		for(int i = 0; i < cuidadores.size(); i++){
			if(cuidadores.get(i).getId() == id){
				cuidadores.remove(i);
				for(int p = 0; p < animais.size(); p++){
					if(animais.get(p).getIdCuidador().equals(cuidadores.get(p)))
						animais.get(p).setIdCuidador(null);
				}
			}
		}
	}
	
	/*-------------------- MÉTODOS - PRODUTOS --------------------------------------------*/
	
	public Produto getProdutos(int index){
		return produtos.get(index);
	}
	
	/*--------------------------------------------------------------*/
	
	public void exibirProdutos() throws Exception{
		if (!produtos.isEmpty())
	    	for (int i=0; i < produtos.size(); i++){
	    		System.out.println(produtos.get(i) + "\n");
	    	}
	    else
	    	throw new Exception ("Nao ha produtos registrados.");
	}
	
	/*--------------------------------------------------------------*/
	
	public boolean find(Produto p){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.equals(produtos.get(i)))
				return true;
		
		}
		return false;
	}
	
	/*--------------------------------------------------------------*/

	/**
	 * Verifica se um produto já existe e se existir, ele adiciona a quantidade indicada 
	 * Se não, ele adiciona o novo produto. 
	 * */
	public void addProduto(Produto p) {
		if(find(p)){
			for(int i = 0; i < produtos.size(); i++){
				if(produtos.get(i).getNome().equals(p.getNome())){
					int qt = produtos.get(i).getQuantidade();
					produtos.get(i).setQuantidade(qt + p.getQuantidade());
				}		
			}
		} else
			produtos.add(p);
	}
	
	/*--------------------------------------------------------------*/

	/**@see
	 * Exibe os produtos existentes, recebendo em seguida um produto e diminuindo a sua quantidade 
	 * */
	public void comprarProduto(Cliente c) throws Exception{
		 try{
			 
			exibirProdutos();
			Scanner r = new Scanner(System.in);
			String resp = r.nextLine();
			for(int i = 0; i < produtos.size(); i++){
				if(produtos.get(i).getNome().toUpperCase().equals(resp.toUpperCase())){
						c.valorConta(produtos.get(i).getPreco());
						int qt = produtos.get(i).getQuantidade();
						produtos.get(i).setQuantidade(qt--);
					}		
				}
		 	r.close();
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	} 
	
	/*--------------------------------------------------------------*/

	public void removerProduto(String nome){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).getNome().toUpperCase().equals(nome.toUpperCase())){
				produtos.remove(i);
			}
		}
	}
	
	
}
