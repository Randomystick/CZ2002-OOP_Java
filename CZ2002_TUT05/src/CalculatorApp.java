import java.util.Scanner;


public class CalculatorApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		Boolean quit = false;
		Boolean operatorReceived = false;
		System.out.println("Calculator is on");
		System.out.println("result = " + calc.getResult());
		while (!quit)
		{
			char operator = 0;
			while (!operatorReceived)
			{
				// get operator
				try
				{
					operator = sc.next().charAt(0);
					if (operator == 'q' || operator == 'Q')
					{
						quit = true;
						System.out.println("final result is " + calc.getResult());
						System.out.println("End of Program");
						break;
					}
					else if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
					{
						throw new UnknownOperatorException(operator);
					}
					else
					{
						operatorReceived = true;
					}
				}
				catch (UnknownOperatorException e)
				{
					System.out.println(e.getMessage());
					System.out.println("Please reenter: ");
				}
			}
			//System.out.println("operator is " + operator);
			
			double operand = sc.nextDouble();
			//get operand
			if (operand == 'q' || operand == 'Q')
			{
				quit = true;
				System.out.println("final result is " + calc.getResult());
				System.out.println("End of Program");
			}
			//System.out.println("operand is " + operand);
			
			double newResult = -1;
			switch(operator)
			{
				case '+':
					newResult = calc.Addition(operand);
					break;
				case '*':
					newResult = calc.Multi(operand);
					break;
				case '-':
					newResult = calc.Subtract(operand);
					break;
				case '/':
					newResult = calc.Division(operand);
					break;
			}
			System.out.println("result " + operator + " " + operand + " = " + newResult);
			System.out.println("updated result = " + calc.updateResult(newResult));
			operatorReceived = false;
		} // end while quit
	}
}
