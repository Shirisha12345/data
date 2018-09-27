import java.util.Scanner;  
class VowelConsonant{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);    
   System.out.println("Enter the word");  
   char[] name=sc.next().toCharArray();
for(int i=0;i<name.length;i++)
{
if((name[i]<'a'||name[i]>'z')&&(name[i]<'A'||name[i]>'Z'))
System.out.println("not a letter");
else{
switch(name[i])
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("Vowel");
break;
default:System.out.println("Consonant");
}
}
}
}
}
  
