package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B': // her iki durumda da aynı mesajı vermek için bu şekilde kullanılabilir.
		case 'C':
			System.out.println("Orta : Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz bir not girdiniz.");
		}
	}

}
