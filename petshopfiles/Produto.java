package PetShop.petshopfiles;

public class Produto {
	
		private String nome;
		private double preco;
		private int quantidade;
			
		/**
		 * Construtor da classe produto 
		 */
		public Produto(String nome,double preco, int quantidade) {
			setNome(nome);
			setPreco(preco);
			setQuantidade(quantidade);
		}
		
		/*
		 * Getters e Setters 
		 */
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
	  /*-----------------------------------------------*/
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
	/*-----------------------------------------------*/
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
}
