public class Calculator
{
	public Calculator()
	{
		
	}
	
	private double result = 0.0;
	
	public double getResult()
	{
		return result;
	}
	
	public double updateResult(double newResult)
	{
		result = newResult;
		return result;
	}
	
	public double Addition(double operand)
	{
		return result+operand;		
	}
	
	public double Multi(double operand)
	{
		return result*operand;
	}
	
	public double Subtract(double operand)
	{
		return result-operand;
	}
	
	public double Division(double operand)
	{
		return result/operand;
	}
	
		
}
