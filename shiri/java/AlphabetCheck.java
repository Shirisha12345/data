import java.util.Scanner;
class AlphabetCheck{  
	public static void main(String args[]){  
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter something");
char n=sc.next().charAt(0);
if(n>='a'&&n<='z')
System.out.println("Small Case letter");
else if(n>='A'&&n<='Z')
System.out.println("Capital letter");
else if(n>='0'&&n<='9')
System.out.println("Digit");
else
System.out.println("Symbol");
}
}



