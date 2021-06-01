package memory_recall;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		Pattern p=Pattern.compile("[VIBGYOR]*");
		String str=sc.nextLine();
		
		Matcher m=p.matcher(str.toUpperCase());
		if(!m.matches())
			System.out.println("Invalid Input");
		else {
			for(int i=0;i<str.length();i++)
			{
				switch(str.charAt(i)) {
				case 'V': System.out.println("Violet");
					break;
				case 'I': System.out.println("Indigo");
					break;
				case 'B': System.out.println("Blue");
					break;
				case 'G': System.out.println("Green");
					break;
				case 'Y': System.out.println("Yellow");
					break;
				case 'O': System.out.println("Orange");
					break;
				case 'R': System.out.println("Red");					
				}
			}
		}

	}

}
