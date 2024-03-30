package hello_world;

import java.util.Scanner;

public class condicoes {

	public static void main(String[] args) {
		
		int number = 80;
		
		Scanner scan = new Scanner(System.in);
		
		int numeroAdivinhacao;
		
		System.out.print("Digite um número: ");
		numeroAdivinhacao=scan.nextInt();
		
		if(numeroAdivinhacao == number) {
			System.out.print("Parabéns você acertou ");
		}
		else {
			System.out.print("Errou");
		}
	}

}
