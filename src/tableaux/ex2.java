package tableaux;

import java.util.Scanner;

public class ex2 {

	public static boolean isGood(char[] tab, String lettre)
	{
		for(int pos = 0; pos < 5; pos++)
		{
			if(lettre.charAt(0) == tab[pos])
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tab = {'a','v','i','o','n'};
		Scanner scan = new Scanner(System.in);
		String lettre;
		
		System.out.println("entrez une lettre");
		lettre = scan.next();
		if(isGood(tab, lettre))
		{
			System.out.println("Vous avez gagne !");
		}
		else
		{
			System.out.println("Vous avez perdu !");
		}
	}

}
