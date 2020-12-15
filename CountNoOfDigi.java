
public class CountNoOfDigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1 = 12638;
	numOfDigi(num1);
	
	int num2 = 398293;
	numOfDigi(num2);
	
	int num3 = 4566;
	numOfDigi(num3);
	
	
	}
	static void numOfDigi(int num) {
		
		int count = 0;
		while(num!=0) {
			num/=10;
			++count;
		}
		
		System.out.println("number of didgits = " + count);
		
	}
	
	
	
	
	
	
	
	
	
	
	}


