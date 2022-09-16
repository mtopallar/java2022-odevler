package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 => 1e 2 ye 3e bölünür, 1+2+3 = 6 yani 6 mükemmel sayı.
		// 28 => 1,2,4,7,14 e bölünür. 1+2+4+7+14 = 28 yani mükemmel sayı.
		int number = 28;
		int bolenlerinToplamı = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				bolenlerinToplamı += i;
			}
		}
		
		if (bolenlerinToplamı == number) {
			System.out.println("Mükemmel sayıdır : " + number);
		}
		else {
			System.out.println("Mükemmel sayı değildir : " + number);
		}
		
	}

}
