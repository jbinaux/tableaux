package tableaux4;

import java.util.Scanner;

public class SumFirstInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] tab;
		
		System.out.println("Entrez un nombre entier");
		n = scan.nextInt();
		tab = new int[n + 1];
		for(int i = 0; i <= n; i++)
		{
			if(i == 0)
			{
				tab[i] = 0;
			}
			else
			{
				tab[i] = tab[i - 1] + i;
			}
		}
		for(int i = 0; i <= n; i++)
		{
			System.out.print(tab[i] + " ");
		}
	}

}
