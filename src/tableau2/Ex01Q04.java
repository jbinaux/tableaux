package tableau2;

import java.util.Scanner;

public class Ex01Q04 {

	public static void affichage(int[] tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			System.out.print(tab[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static int[] swap(int index1, int index2, int[] tab)
	{
		int tmp;
		tmp = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = tmp;
		return tab;
	}
	
	public static void main(String[] args) {
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un chiffre");
		int index1 = scan.nextInt();
		System.out.println("entrez un chiffre");
		int index2 = scan.nextInt();
		affichage(tab);
		if(index1 < tab.length && index1 > 0 && index1 < tab.length && index1 > 0)
		{
			swap(index1, index2, tab);
		}
		affichage(tab);
	}

}
