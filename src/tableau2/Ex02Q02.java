package tableau2;

import java.util.Scanner;

public class Ex02Q02 {

	public static int plusGrand(int[] tab)
	{
		int grand;
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
		int[] tabInt = new int[6];
		for(int i = 0; i < tabInt.length; i++)
		{
			System.out.println("entrez un nombre");
			tabInt[i] = scan.nextInt();
		}
		System.out.println(plusGrand(tabInt));
	}

}
