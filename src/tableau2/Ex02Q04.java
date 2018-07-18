package tableau2;

import java.util.Scanner;

public class Ex02Q04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tabInt = new int[6];
		double moyenne = 0;
		for(int i = 0; i < tabInt.length; i++)
		{
			System.out.println("entrez un nombre");
			tabInt[i] = scan.nextInt();
		}
		for(int i = 0; i < tabInt.length; i++)
		{
			moyenne += tabInt[i];
		}
		moyenne /= tabInt.length;
		System.out.println(moyenne);
	}

}
