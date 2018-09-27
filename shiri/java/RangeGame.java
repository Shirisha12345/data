import java.util.Scanner;
 
public class RangeGame
{
    public static void main(String[] args)
    {
	int target=62;
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number between 1-100");
	int n = sc.nextInt();
	while(n!=target){
	
	
		if(n>target){
			System.out.println("Your Number is greater");
			n=sc.nextInt();
}
		else if(n<target){
			System.out.println("Your Number is lesser");
			n=sc.nextInt();
		}
	
	    }//while

if(n==target){
		System.out.println("You got it right!!");
	}

}
}
		
