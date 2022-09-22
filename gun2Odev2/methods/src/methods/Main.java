package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean flag = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				flag = true;
				break;
			}
		}

		if (flag) {
			mesajver("aranan sayı dizin içinde mevcut. " + aranacak);
		} else {
			mesajver("aranan sayı dizi içinde mevcut değil. " + aranacak);
		}
	}

	public static void mesajver(String mesaj) {
		System.out.println(mesaj);
	}

}
