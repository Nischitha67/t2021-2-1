import java.util.Scanner;

public class Problem2 {

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
            a++;
            if(a%2==0&& x==a)
            	break;
            if(a!=x+1)
                s+=",";
        }
        System.out.println("input a = "+x+", output : "+s);
	}

}
