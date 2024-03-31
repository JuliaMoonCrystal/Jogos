package hello_world;

public class Game {

	public static void main(String[] args) {
		player jogador = new player();
		FlowerEnimy flower = new FlowerEnimy();
		
		System.out.print(jogador.life+"\n");
		
		jogador.loseLife();
		
		System.out.print(jogador.life+"\n");
		
        jogador.gainLife();
		
		System.out.print(jogador.life);
		System.out.print(flower.life);
		
		
	}

}
