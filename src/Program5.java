import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre o texto a ser invertido: ");
		
		String entrada = sc.nextLine();
		String saida = "";
		
		for (int i = 0; i<entrada.length(); i++) {
			saida = entrada.charAt(i) + saida;
		}
		
		System.out.println(saida);
		sc.close();
	}

}
