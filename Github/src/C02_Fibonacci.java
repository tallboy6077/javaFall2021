

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		//Verilen bir sayidan kucuk fibonacci sayilarini bir list olarak kaydedelim.
		
		//1,1,2,3,5,8,13,21,34,55,.........
		
		
		int sinir=100; // 100'den kucuk olan fibonacci sayilarini siralayalim.
		
		//oncelikle LIST olustururuz.
		
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		
		int sayi=0;
		while (sayi<sinir) {
			
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			fibonacci.add(sayi);
			
		}
	System.out.println(fibonacci);	
	fibonacci.remove(fibonacci.size()-1);
	System.out.println(fibonacci); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

		}
		
	}


