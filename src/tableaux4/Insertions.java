package tableaux4;

import java.util.Scanner;

public class Insertions {

	public static char[] truc(char[] tab)
	{
		char[] tabNew;
		char[] tabInsert;
		int n;
		int i;
		int l = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("entrez un nombre de caracteres");
		n = scan.nextInt();
		System.out.println("entrez un indice");
		i = scan.nextInt();
		tabInsert = new char[n];
		tabNew = new char[n + tab.length];
		for(int j = 0; j < n; j++)
		{
			System.out.println("entrez un caractere");
			tabInsert[j] = scan.next().charAt(0);
		}
		for(int j = 0; j < tabNew.length; j++)
		{
			if(j == i && i < tab.length)
			{
				for(int k = 0; k < n; k++)
				{
					tabNew[j] = tabInsert[k];
					j++;
				}
			}
			else if(i > tab.length && j == tab.length)
			{
				for(int k = 0; k < n; k++)
				{
					tabNew[j] = tabInsert[k];
					j++;
				}
			}
			if(l < tab.length)
			{
				tabNew[j] = tab[l];
				l++;
			}
		}
		for(int j = 0; j < tabNew.length; j++)
		{
			System.out.print(tabNew[j] + " ");
		}
		return tabNew;
	}
	
	public static void main(String[] args) {
		char[] tab;
		char[] init = {'x','r','l','b'};
		char c;
		Scanner scan = new Scanner(System.in);
		
		tab = truc(init);
		while(true) 
		{
			System.out.println("\nVoulez vous continuer ? Y/N");
			c = scan.next().charAt(0);
			while(c != 'y' && c != 'Y' && c != 'n' && c != 'N') 
			{
				c = scan.next().charAt(0);
			}
			if(c == 'n' || c == 'N')
			{
				break;
			}
			else
			{
				tab = truc(tab);
			}
		}
	}

}
