import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		double a,b;
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
        a=scan.nextDouble();
        b=scan.nextDouble();
        System.out.println("Press + for addition");
        System.out.println("Press - for substraction");
        System.out.println("Press * for multiplication");
        System.out.println("Press / for division");
        s=scan.next();
        switch(s)
        {
        case "+": System.out.println(a+b);
        break;
        case "-": System.out.println(a-b);
        break;
        case "*": System.out.println(a*b);
        break;
        case "/": System.out.println(a/b);
        break;
        default:System.out.println("Invalid type of operation");
        }
	}

}
