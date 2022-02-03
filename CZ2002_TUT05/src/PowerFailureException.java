public class PowerFailureException extends Exception
{
	//constructor with no params
	public PowerFailureException()
	{
		super("Power Failure!");
	}
	
	//constructor with single parameter of type String
	public PowerFailureException(String param)
	{
		super(param);
	}
}

	
