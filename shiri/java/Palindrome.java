import java.util.Scanner;
class Palindrome{  
	public static void main(String args[]){  
		int r,sum=0,temp,evensum=0,rem,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt(); 
	   
	temp=n;
    
      while(n>0){    
       r=n%10;  
       sum=(sum*10)+r;    
       n=n/10;    
      }    

      if(temp==sum){   
       
	int []num=new int[10];
n=temp;
	for(i=0;i<10;i++)
{
rem=temp%10;
num[i]=rem;
temp=temp/10;
}
for(i=0;i<10;i++){
if(num[i]%2==0)
{
evensum=evensum+num[i];
}
}
if(evensum>=25)
System.out.println(n+ " is palindrome and the sum of even numbers is greater than 25");
else
System.out.println(n+ " is palindrome and the sum of even numbers is less than 25");

}
	 else    
       System.out.println("not palindrome");    
    }  
 }  		 
      
      
