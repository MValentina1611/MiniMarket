package exceptions;

public class WrongDayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	public WrongDayException(String id)
	{
		super("The person should not have gone out today ");	
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}
