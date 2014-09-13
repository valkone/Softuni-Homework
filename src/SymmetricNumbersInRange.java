import java.util.Scanner;


public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String[] inputSplit = input.split(" ");
		
		int start = Integer.parseInt(inputSplit[0]);
		int end = Integer.parseInt(inputSplit[1]);
		for (int i = start; i <= end; i++) {
			if(isSymmetric(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isSymmetric(int n){
		String numberString = Integer.toString(n);
		String[] numberSplit = numberString.split("");
		if(Integer.parseInt(numberSplit[0]) == Integer.parseInt(numberSplit[numberSplit.length-1])){
			return true;
		}
		
		return false;
	}
}
