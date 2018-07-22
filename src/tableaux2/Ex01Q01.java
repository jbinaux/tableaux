package tableaux2;

import java.util.Scanner;

public class Ex01Q01 {

	public static boolean isHere(int[] tab, int compare)
	{
		for(int i = 0; i < tab.length; i++)
		{
			if(compare == tab[i])
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un chiffre");
		int compare = scan.nextInt();
		if(isHere(tab, compare))
		{
			System.out.println("oui");
		}
		else
		{
			System.out.println("non");
		}
	}

}
