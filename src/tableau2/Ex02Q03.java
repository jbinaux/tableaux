package tableau2;

import java.util.Scanner;

public class Ex02Q03 {

	public static char plusGrand(char[] tab)
	{
		char grand;
		grand = tab[0];
		for(int i = 0; i < tab.length; i++)
		{
			if(grand < tab[i])
			{
				grand = tab[i];
			}
		}
		return grand;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] tab = new char[6];
		for(int i = 0; i < tab.length; i++)
		{
			String tmp;
			System.out.println("entrez une lettre");
			tmp = scan.next();
			tab[i] = tmp.charAt(0);
		}
		System.out.println(plusGrand(tab));

	}

}
