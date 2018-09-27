import java.util.Scanner;
 
public class DBEngine
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
	String[] str1=str.split(" ");
for(int i=0;i<str1.length;i++){

System.out.println(str1[i]);

	}
 
}
	}
