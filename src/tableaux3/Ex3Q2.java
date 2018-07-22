package tableaux3;

import java.util.Scanner;



public class Ex3Q2 {

	public static void main(String[] args) {
		char[] tabChar = new char[10];
		Scanner scan = new Scanner(System.in);
		int isLetter = 0;
		int isUpperCase = 0;
		
		for(int i = 0; i < tabChar.length; i++)
		{
			System.out.println("Entrez un caractere");
			tabChar[i] = scan.next().charAt(0);
		}
		for(int i = 0; i < tabChar.length; i++)
		{
			if(Character.isLetter(tabChar[i]))
			{
				isLetter++;
				if(Character.isUpperCase(tabChar[i]))
				{
					isUpperCase++;
				}
			}
		}
		System.out.println("nombre de lettre : " + isLetter + "\nnombre de majuscules : " + isUpperCase);

	}

}
