import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;


public class Public {
	private static Scanner scan;
	private static Scanner scan2;
	private static Scanner scan3;
	public static void main(String[] args) {
        scan = new Scanner(System.in);
		scan2 = new Scanner(System.in);
		scan3 = new Scanner(System.in);
		
		HashMap<Integer, ArrayList<Tipo_de_Plano>> Tipo_de_Plano1 = new HashMap<>();
       
        ArrayList<Tipo_de_Plano> tipoDePlano = new ArrayList<Tipo_de_Plano>();
		
		float valorMensal, franquia, valorChamada; 
		String descricao;
		Integer codigo;
		Tipo_de_Plano plano = null;
		
		System.out.println("************MENU***********");
		System.out.println("1-Cadastrar Tipo de Plano");
		System.out.println("2-Alterar Tipo de Plano");
		System.out.println("3-Excluir Tipo de Plano");
		System.out.println("4-Listar todos os tipos de planos");
		System.out.println("5-Pesquisar Tipo de plano");
		System.out.println("6-Sair");
		
		
		int opcao = scan.nextInt();
		
		do {
			
			switch (opcao) {
			case 1: System.out.println("Código:");
			                codigo = scan.nextInt();

			                System.out.println("Descrição:");
			                descricao = scan3.nextLine();
			                
			                System.out.println("Valor Mensal:");
			                valorMensal = scan2.nextInt();
			                
			                System.out.println("Franquia:");
			                franquia = scan2.nextInt();
			               		                
			                System.out.println("Valor da Chamada:");
			                valorChamada = scan2.nextInt();
			                
			                plano = new Tipo_de_Plano(codigo, descricao, valorMensal, franquia, valorChamada);
			                tipoDePlano.add(plano);
			                Tipo_de_Plano1.put(codigo, tipoDePlano);
			                
			                break;   
			             
			
                            
			} 
		} while(opcao != 6);
	

	}

}
