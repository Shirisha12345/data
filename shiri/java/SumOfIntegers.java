import java.util.Scanner;
class SumOfIntegers{  
	public static void main(String args[]){ 
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int n=sc.nextInt(); 
		int []a=new int[n];   
   		System.out.println("Enter the numbers");
try{
		for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				sum=sum+a[i];
			}
}
catch(Exception e){
System.out.println("It is not an integer");
}
System.out.println(+sum);

	}
}
