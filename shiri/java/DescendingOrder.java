import java.util.Scanner;
class DescendingOrder{  
	public static void main(String args[]){ 
        int temp,rem,a,evensum=0;

       Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of digits");
int x=sc.nextInt();

System.out.println("Enter the number");
int n=sc.nextInt();   
	int []num=new int[x];
	
	for(a=0;a<x;a++)
{
rem=n%10;
num[a]=rem;
n=n/10;
}
        for (int i = 0; i <x; i++) 

        {

            for (int j = i + 1; j <x; j++) 

            {

                if (num[i] < num[j]) 

                {

                    temp = num[i];

                    num[i] = num[j];

                    num[j] = temp;

                }

            }

        }

        System.out.print("Descending Order:");

        for (int i = 0; i < x-1; i++) 

        {

            System.out.print(+num[i]);

        }

        System.out.print(num[x-1]+"\n");

  
for(int i=0;i<x;i++){
if(num[i]%2==0)
{
evensum=evensum+num[i];
}
}
System.out.println("Sum of even numbers: "+evensum);
if(evensum>=15)
System.out.println("true");
else
System.out.println("false");


	    
    } 
 }  		 
      
      
