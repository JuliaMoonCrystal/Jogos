package hello_world;

public class Enemy {
	
	public int life =100;
	public String typeEnimy ="tipo 1";
	public int damage =12;
	
	public void loseLife() {
		life-=1;
	}
	
	public void gainLife() {
		life+=1;
	}
}
