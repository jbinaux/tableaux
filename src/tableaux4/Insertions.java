package tableaux4;

import java.util.Scanner;

public class Insertions {

	public static void main(String[] args) {
		char[] tab = {'x', 'r', 'l', 'b'};
		char[] tabNew;
		char[] tabInsert;
		Scanner scan = new Scanner(System.in);
		int n;
		int i;
		int l = 0;
		
		System.out.println("entrez un nombre de caracteres");
		n = scan.nextInt();
		System.out.println("entrez un indice");
		i = scan.nextInt();
		tabInsert = new char[n];
		tabNew = new char[n + 4];
		for(int j = 0; j < n; j++)
		{
			System.out.println("entrez un caractere");
			tabInsert[j] = scan.next().charAt(0);
		}
		for(int j = 0; j < tabNew.length; j++)
		{
			if(j == i && i < 4)
			{
				for(int k = 0; k < n; k++)
				{
					tabNew[j] = tabInsert[k];
					j++;
				}
			}
			else if(i > 4 && j == 4)
			{
				for(int k = 0; k < n; k++)
				{
					tabNew[j] = tabInsert[k];
					j++;
				}
			}
			if(l < 4)
			{
				tabNew[j] = tab[l];
				l++;
			}
		}
		for(int j = 0; j < tabNew.length; j++)
		{
			System.out.print(tabNew[j] + " ");
		}
	}

}
