import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
        x=scan.nextInt();
        int a=1; String s=""; Integer temp=new Integer(1);
        while(x>=a)
        {
        	s+=temp.toString();
           temp+=2;
           if(a%2!=0)      	   
           System.out.println("input a = "+a+" then, output : "+s);
           a++;
           if(a%2==0&& x>=a) 
           	System.out.println("input a = "+a+" then, output : "+s);
           s+=",";
        }
	}

}
