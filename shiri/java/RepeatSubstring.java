import java.util.Scanner;
 
public class RepeatSubstring
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
	System.out.println("Enter the number");
	int n = sc.nextInt();
	String substr=str.substring(n);
	System.out.print(str);
	for(int i=0;i<n;i++)
	{
	   System.out.print(substr);
	}
     }
}    



