package PetShop;

import java.util.*;



public class CuidadorUI {

	/**
	 * Menu principal do cuidador, ligado ao menu de escolha da subse��o e aos submenus desse.
	 */
	public static void inicializar(PetShop petshop){
		try{
			do{
			
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Opcoes para gerencia de cuidadores \n"
							+ "  2 - Opcoes para gerencia de animais \n"
							+ "  3 - Opcoes para gerencia de produtos \n"
							+ "  4 - Opcoes para gerencia de clientes \n"
							+ "  5 - Voltar ao Menu ");
			
			}while(CuidadorUI.escolha(petshop));
		} catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Menu de direcionamento das subse��es 
	 */
	
	public static boolean escolha(PetShop petshop) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					CuidadorUI.atividadesCuidador(petshop);
					
					return true;
				case "2":
					CuidadorUI.atividadesAnimal(petshop);
					
					return true;
				case "3":
					CuidadorUI.atividadesProduto(petshop);
					return true;
				case "4":
					CuidadorUI.atividadesCliente(petshop);
					return true;
				default:
					PetShopUI.escolha(petshop);
					return false;
					
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
			return true;
		}
	}
	
	/**
	 * Submenu de execu��o das atividades relacionadas ao cuidador 
	 * @param petshop
	 * @return 
	 * @throws Exception
	 */
	
	public static boolean atividadesCuidador(PetShop petshop) throws Exception {
	try{
		
	
		 		Scanner sc = new Scanner(System.in);
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Cadastrar cuidador \n "
								+ "2 - Remover cuidador \n"
								+ "3 - Exibir cuidadores \n");
				String op = sc.nextLine();
				
				switch(op){
					case "1" :
						
						System.out.println("Insira o nome do cuidador: ");
						String nome = sc.nextLine();
						System.out.println("Insira o CPF: ");
						String cpf = sc.nextLine();
						System.out.println("Insira a identifica��o dele: ");
						String identificacao = sc.nextLine();
						System.out.println("Insira o salario dele: ");
						double sal = sc.nextDouble();
						Cuidador c = new Cuidador(nome,cpf,identificacao,sal);
						petshop.addCuidador(c);
						System.out.println("Cuidador cadastrado com sucesso!");
						return true;
						
					case "2":
						
						System.out.println("Insira a id do cuidador: ");
						petshop.removerCuidador(sc.nextLine()); //NOT WORKING
						//add mensagem
						return true;
						
					case "3":
						petshop.exibirCuidadores();
						return true;
						
					default: 
						System.out.println("Insira um caracter valido!");
						return true;
				}					
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		return true;
	}
	
	/**
	 * Submenu de execu��o de atividades relacionadas aos animais
	 */
	public static boolean atividadesAnimal(PetShop petshop){
		try{
			
			
	 		Scanner sc = new Scanner(System.in);
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Cadastrar animal \n "
							+ "2 - Remover animal \n" 
							+ "3 - Exibir animais \n");
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					
					System.out.println("Insira a raca do animal:");
					String raca = sc.nextLine();
					System.out.println("Insira a idade:");
					int idade = sc.nextInt();
					System.out.println("Insira o peso:");
					double peso = sc.nextDouble();
					System.out.println("Insira a ID do cliente responsavel: ");
					String idCliente = sc.nextLine();
					System.out.println("Insira a ID do animal: ");
					String cod = sc.nextLine();
					System.out.println("Insira a ID do cuidador: ");
					String idCuidador = sc.nextLine();
					Animal a = new Animal(raca, idade, peso, idCliente, cod, idCuidador);
					petshop.addAnimal(a);
					System.out.println("Animal cadastrado com sucesso!");
					return true;
					
				case "2":
					
					System.out.println("Insira a ID do animal: ");
					petshop.removerAnimal(sc.nextLine());
					//add mensagem 
					return true;
				case "3":
					petshop.exibirAnimais();
					return true;
				default: 
					System.out.println("Insira um caracter valido!");
					return true;
			}
					
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		return true;
    }
	
	/**
	 * Submenu de execu��o de atividades relacionadas aos produtos
	 */
	public static boolean atividadesProduto(PetShop petshop){
		try{
			
			
	 		Scanner sc = new Scanner(System.in);
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar produto \n "
							+ "2 - Remover produto \n"
							+ "3 - Exibir produtos \n");
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					
					System.out.println("Produtos cadastrados: ");
					petshop.exibirProdutos();
					System.out.println("\n Insira os dados do novo produto ou do que ser� atualizado: ");
					System.out.println("Nome:");
					String nome = sc.nextLine();
					System.out.println("Preco: ");
					double preco = sc.nextDouble();
					System.out.println("Quantidade a ser acrescentada ou inicial:");
					int qtd = sc.nextInt();
					Produto p = new Produto (nome, preco, qtd);
					petshop.addProduto(p);
					System.out.println("Produto cadastrado/atualizado com sucesso!");
					return true;
					
				case "2":
					
					System.out.println("Insira o nome do produto: ");
					petshop.removerProduto(sc.nextLine());
					//add mensagem 
					return true;
				case "3":
					petshop.exibirProdutos();
				default: 
					System.out.println("Insira um caracter valido!");
					return true;
			}
					
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		return true;
    }
	
	public static boolean atividadesCliente(PetShop petshop) throws Exception {
		try{
			
		
			 		Scanner sc = new Scanner(System.in);
					System.out.println("O que deseja fazer?");
					System.out.println("1 - Cadastrar cliente \n "
									+ "2 - Remover cliente \n"
									+ "3 - Exibir clientes \n");
					String op = sc.nextLine();
					
					switch(op){
						case "1" :
							System.out.println("Insira o nome do cliente: ");
							String nome = sc.nextLine();
							System.out.println("Insira o CPF: ");
							String cpf = sc.nextLine();
							System.out.println("Insira a identifica��o dele: ");
							String identificacao = sc.nextLine();
							Cliente c = new Cliente(nome,cpf,identificacao);
							c.setConta(0);
							petshop.addCliente(c);
							System.out.println("Cliente cadastrado com sucesso!");
							return true;
							
						case "2":
							
							System.out.println("Insira a id do cliente: ");
							petshop.removerCliente(sc.nextLine()); //NOT WORKING
							//add mensagem
							return true;
							
						case "3":
							petshop.exibirClientes();
							return true;
							
						default: 
							System.out.println("Insira um caracter valido!");
							return true;
					}					
								
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		return true;
	}
	
	
}
