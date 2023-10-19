git initimport java.lang.*;
public class quraticsolver { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 100;
		int c = 100;
		if (b*b - 4*a*c <0)
			System.out.println("This Math Question " + a + "x^2 + " + b +"x + " + c +" demonstrates no solution!");
		else
			{
				System.out.println("The solution for these equations " + a + "x^2 + " + b +"x + " + c +" are as follows");
				System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a + " and " + (-b-Math.sqrt(b*b-4*a*c))/2*a);
			}
	}

}
