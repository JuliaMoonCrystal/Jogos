package hello_world;

import java.util.Iterator;

public class repeticao {

	public static void main(String[] args) {
		int cont =1;
		
		while (cont != 10) {
			 System.out.print("Número cont:" +cont+"\n");
			cont ++;
			
			
		}
		
		do {
			 System.out.print("Número cont do while:" +cont+"\n");
			cont ++;
		} while (cont <= 10);
		
		for (int i = 1;i <=10;i++) {
			 System.out.print("Número cont for" +i+"\n");
			
		}
		
		

	}

}
