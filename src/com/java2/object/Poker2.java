package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	String flowers ="SHDC";
	List<Integer> cards = new ArrayList<>();
	
	
	public void shuffle(){
		for(int i=0;i<52;i++){
			int r = random.nextInt(52);
			cards.set(i, r);
			
			
		}
	}
}
