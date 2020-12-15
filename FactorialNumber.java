
public class FactorialNumber {

public static void main(String[] args) {
	 int num1 = 5; 
	 factorialofNum(num1);
	 
	 int num2 = 4;
	 factorialofNum(num2);
	}
	 
	static void factorialofNum(int num) {
		int fact = 1,i = 1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
			System.out.println(" factorial of " + num + " is :" + fact);
	}
}














