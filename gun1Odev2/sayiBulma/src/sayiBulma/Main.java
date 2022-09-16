package sayiBulma;


public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean flag = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("aranan sayı dizin içinde mevcut.");
		}else {
			System.out.println("aranan sayı dizi içinde mevcut değil.");
		}

	}

}
