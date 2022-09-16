package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı = " + mesaj.length());
		 * System.out.println("Beşinci eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!")); // string birleştirme
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); // Bugünün ilk 5 karakteri => istenilen
		 * karakterleri char[] e atar. // mesajın 0. indexinden başlayarak, 5.indexi
		 * dahil -get chars burada verilen // indexi dahil etmiyor- yani ilk 5
		 * karakterini, // karakterler char[] ine at, karakterler array'inin 0.
		 * indexinden başla. System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf('a')); // ilk bulduğunu verir ve işlemi
		 * bitirir. "av" da aranabilir. System.out.println(mesaj.lastIndexOf('e')); //
		 * aramaya en sağdan başlar. Bulduğu karakterin indexini sola göre verir.
		 */
		
		String yenimesaj = mesaj.replace(' ', '-');
		System.out.println(yenimesaj);
				
		System.out.println(mesaj.substring(2)); // metni belirtien indexten böler. yani indexe kadarki kısmı atar.
		System.out.println(mesaj.substring(2,5)); // ilk indexten başlar son indexe kadar keser.
		
		//Split bir metni belli bir karakter veya karakter dizisine göre parçalar ve bir dizine atar. Örn metni boşluklardna keselim.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // metni küçük harfli yapar.
		System.out.println(mesaj.toUpperCase()); // metni büyük harfe dönüştürür.
		
		String sonMesaj = "           Yeni mesaj.           ";
		System.out.println(sonMesaj.trim());
	}

}
