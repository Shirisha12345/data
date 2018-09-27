import java.util.Scanner;
class TomJerry{  
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2==0&&n>=20&&n<=30)
			System.out.println("Jerry");
		if(n%2!=0&&n>=20&&n<=30)
			System.out.println("Tom");
		}
}

	
