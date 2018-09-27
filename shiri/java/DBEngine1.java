public class DBEngine1
{
    public static void main(String[] args)
    {
	String str="select * from ipl.csv where season > 2014 and city = 'Bangalore';";
//1
	String[] str1=str.split("where");
	String str2=str1[0];
	String[] output=str2.split("from");
	System.out.println(output[1]);
//2
	String[] strr=str.split("where");
	System.out.println(strr[0]);
//3
	String[] str3=str.split("where");
	System.out.println(str3[1]);
//4
	String[] str4=str.split("where");
	String s1=str4[1];
	String[] output1=s1.split("and");
	System.out.println("Condition 1 : "+output1[0]);
	System.out.println("Condition 2 : "+output1[1]);
//5
	String[] str5=str.split("where");
	String s2=str5[1];
	String[] output2=s2.split("and");
	String s3=output2[0];
	String[] output3=s3.split(" ");
	System.out.println("Condition 1 : ");
	System.out.println("variable : "+output3[1]);
	System.out.println("operator : "+output3[2]);
	System.out.println("value : "+output3[3]);
	String s4=output2[1];
	String[] output4=s4.split(" ");
	System.out.println("Condition 2 : ");
	System.out.println("variable : "+output4[1]);
	System.out.println("operator : "+output4[2]);
	System.out.println("value : "+output4[3]);
//6
	String s6="select season,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or date > '31-12-2014';";
	



	


	
	


}
}
