package tableaux2;

import java.util.Scanner;

public class Ex01Q03 {

	
	public static int nbIndex(int[] tab, int compare)
	{
		for (int i = 0; i < tab.length; i++)
		{
			if(compare == tab[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un chiffre");
		int compare = scan.nextInt();
		int index = nbIndex(tab, compare);
		if(index != -1)
		{
			System.out.println(index);
		}
	}
}
