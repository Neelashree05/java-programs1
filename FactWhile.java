
public class FactWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = 5, fact =1,i = 1;
	while(i<=num)
	{
		fact = fact* i;
		i++;
	}
	
	System.out.println("Fcatorial of "  +num+ " is:" +fact);
	}

}
