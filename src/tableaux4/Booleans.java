package tableaux4;

import java.util.Scanner;

public class Booleans {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] tab = new boolean[4];
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Entrez true ou false");
			tab[i] = scan.nextBoolean();
		}
		System.out.println(tab[0] + " et " + tab[1] + " et " + tab[2] + " et " + tab[3] + " = " + (tab[0] && tab[1] && tab[2] && tab[3]));
		System.out.println(tab[0] + " ou " + tab[1] + " ou " + tab[2] + " ou " + tab[3] + " = " + (tab[0] || tab[1] || tab[2] || tab[3]));
	}

}
