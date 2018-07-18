package tableau2;

import java.util.Scanner;

public class Ex02Q01 {

	public static void affichage(int[] tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			System.out.println(tab[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tabInt = new int[6];
		for(int i = 0; i < tabInt.length; i++)
		{
			System.out.println("entrez un nombre");
			tabInt[i] = scan.nextInt();
		}
		affichage(tabInt);
	}

}
