public class UnknownOperatorException extends Exception
{
	public UnknownOperatorException(char operator)
	{
		super(operator + " is an unknown operator! Must be +, -, *, or /");
	}
	
	public UnknownOperatorException()
	{
		super();
	}
	
	public UnknownOperatorException(String message)
	{
		super(message);
	}

}
