package hackers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			List<Character> l=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the firstname and lastname");
			String fname=sc.next();
			String lname=sc.next();
			if((fname.length()<4)&&(lname.length()<4))
				System.out.println(fname+" "+lname+" is too short");
			else if(fname.length()<4)
				System.out.println(fname+" is too short");
			else if(lname.length()<4)
				System.out.println(lname+" is too short");
			else {
			      			
				for(int i=0;i<fname.length();i++)
				{	
					int count=0;
					for(int j=0;j<fname.length();j++)
					{
						if((fname.charAt(i)==fname.charAt(j))&&(i!=j))
							count++;
					}
					if(count==0) 
						l.add(fname.charAt(i));					
						
				}
				if(l.size()>0) {
					System.out.println("First non-repeating character in "+fname);
					System.out.println(l.remove(0));
				}
				else {
					System.out.println("No non-repeating characters "+fname);
				}	
				l.clear();
				for(int i=lname.length()-1;i>=0;i--)
				{
					int count=0;
					for(int j=lname.length()-1;j>=0;j--)
					{
						if((lname.charAt(i)==lname.charAt(j))&&(i!=j))
							count++;
					}
					
					if(count==0) {
						l.add(lname.charAt(i));	
				
						}
				}
				
				if(l.size()>0) {
					System.out.println("Last non-repeating character in "+lname);
					System.out.println(l.remove(0));
				}
				else {
					System.out.println("No non-repeating characters "+lname);
				}
			}
			
			
	}

}
