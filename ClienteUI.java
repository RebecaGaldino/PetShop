package PetShop;

import java.util.Scanner;

public class ClienteUI {
	//To do: menu de operações de solicitar banho e tosa e adicionar à conta do cliente.
	Scanner s = new Scanner(System.in);
	/**
	 * Menu principal do cliente, ligado ao menu de escolha da subseção e aos submenus desse.
	 */
	public static void inicializar(Cliente c, PetShop petshop){
		try{
			do{
			
			System.out.println("O que deseja fazer?");
			System.out.println(" 1 - Solicitar banho \n"
							+ "  2 - Solicitar tosa \n"
							+ "  3 - Acesso aos produtos \n"
							+ "  4 - Emitir fatura \n"
							+ "  5 - Pagar fatura \n"
							+ "  6 - Voltar ao Menu ");
		    
			} while(ClienteUI.escolha(petshop, c));
			
		} catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	public static boolean escolha(PetShop p, Cliente c){
		Scanner s = new Scanner(System.in);
		int op = s.nextInt();
		    
		switch(op){
		case 1:
			c.valorConta(50.00);
			System.out.println("Banho agendado com sucesso");
			return true;
		case 2:
			c.valorConta(60.00);
			System.out.println("Tosa agendada com sucesso");
			return true;
		case 3:
			try{
				p.comprarProduto(c);
				return true;
			} catch (Exception e){
				System.err.println(e.getMessage());
				return true;
			}
			
		case 4:
			EmitirFatura(c);
			break;
		case 5:
			PagarFatura(c);
			break;
		case 6: 
			return false;
			
		default:
			System.out.println("Insira um digito valido! ");
		    return true;
		}
		return true;
	}
	
	/**@see 
	 * Emite fatura
	 */
	public static void EmitirFatura(Cliente c){
		System.out.println("----------------FATURA-------------------\n");
		System.out.println("\n \n Total gasto com serviços: ");
		System.out.println("\n \n" + c.getConta());
	}
	/**@see 
	 * Realiza o pagamento da fatura.
	 */
	public static void PagarFatura(Cliente c){
		c.setConta(0);
		System.out.println("-----------------------------------\n");
		System.out.println("\n \n  Sua fatura foi paga! Muito Obrigada por usar nossos servicos. ");
	}  
	
}
