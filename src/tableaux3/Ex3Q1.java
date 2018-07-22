package tableaux3;
import java.util.Scanner;

public class Ex3Q1 {

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
			if(((tabChar[i] >= 'a') && (tabChar[i] <= 'z')) || ((tabChar[i] >= 'A') && (tabChar[i] <= 'Z')))
			{
				isLetter++;
				if((tabChar[i] >= 'A') && (tabChar[i] <= 'Z'))
				{
					isUpperCase++;
				}
			}
		}
		System.out.println("nombre de lettre : " + isLetter + "\nnombre de majuscules : " + isUpperCase);
	}

}
