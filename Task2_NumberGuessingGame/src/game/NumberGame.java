package game;

import java.util.Random;

public class NumberGame {

	Random r=new Random();
	
	
	public int Randomnumber(int min,int max) {
		
		return r.nextInt(max - min) + min;
	}
	
}
