package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");

		// Do-while
		int j = 1;
		do {
			//Şart sağlanmasa bile do bloğu bir kere çalışır.
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While döngüsü bitti.");
	}

}
