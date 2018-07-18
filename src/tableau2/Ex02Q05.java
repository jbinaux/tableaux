package tableau2;

import java.util.Scanner;

public class Ex02Q05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre");
		int taille = scan.nextInt();
		char[] tab = new char[taille];
		for(int i = 0; i < tab.length; i++)
		{
			System.out.println("entrez une lettre");
			tab[i] = scan.next().charAt(0);
		}

	}

}
