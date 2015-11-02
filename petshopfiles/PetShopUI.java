package petshopfiles;
import java.util.*;

public class PetShopUI {
	public static void main(String[] args) {
		PetShop petshop = new PetShop();
		escolha(petshop);	

	}
	
	public static void escolha(PetShop petshop){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM VINDO!");
		System.out.println("Selecione a sessao que voce quer ir: ");
		System.out.println("1 - Cliente 2 - Funcionario 3 - Sair");
		String op = sc.nextLine();
		switch(op){
			case "1" :
				//ClienteUI.initialize(petshop); TO DO 
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
