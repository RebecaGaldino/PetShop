package PetShop;
import java.util.*;

public class PetShopUI {
	public static void main(String[] args) {
		PetShop petshop = new PetShop();
		escolha(petshop);	

	}
	
	public static void escolha(PetShop petshop){
		Cliente c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM VINDO!");
		System.out.println("Selecione a sessao que voce quer ir: ");
		System.out.println("1 - Cliente 2 - Funcionario 3 - Sair");
		String op = sc.nextLine();
		switch(op){
			case "1" :
				System.out.println(" Digite sua ID: \n");
				String id = sc.nextLine();
				c = petshop.findCliente(id, petshop);
				
				if(c!= null){
					ClienteUI.inicializar(c, petshop);
				}
				else{
					System.out.println("Você ainda não foi cadastrado,cadastre-se primeiro");
					escolha(petshop);
				}
				break;
			case "2" :
				CuidadorUI.inicializar(petshop);
				break;
			case "3" :
				break;
			default: 
				System.err.println("Insira um digito valido!");
		}
	}

}
