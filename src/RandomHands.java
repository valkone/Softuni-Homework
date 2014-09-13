import java.util.Arrays;
import java.util.Random;


public class RandomHands {
	public static void main(String[] args) {
		int n = 5;
		Random rand = new Random();
		
		String[] cards = {"A","2","3","4","5","6","7","8","9","10","Q","J","K"};
		String[] suids = {"♣","♦","♠","♥"};
		int[] cardsCombination = new int[5];
		int cardSum = 0;
		int counter = 0;
		
		for (int i = 0; i < n; i++) {
			while(true) {
				int cardRand = rand.nextInt(12);
				int suidRand = rand.nextInt(3);
				cardSum = cardRand+suidRand;
				counter++;
				if(counter==5){
					counter = 0;
					break;
					
				}
				if(!Arrays.asList(cardsCombination).contains(cardSum)){
					cardsCombination[i] = cardSum;
					System.out.print(cards[cardRand]+suids[suidRand]+" ");
				}
				
			}
			System.out.println();
		}
	}
}
