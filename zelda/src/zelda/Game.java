package zelda;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
	
	
	@Override
	public void run() {
		while(true) {
			tick();
			render();
			try {
				Thread.sleep(1000/50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.print("rodando \n");
		}
		
	}
	
	public Game () {
		this.setPreferredSize(new Dimension(480,480));
	}
	
	public void tick() {
		
	}
	
	public void render() {
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("ZELDA");
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new Thread(game).start();
	}
}
