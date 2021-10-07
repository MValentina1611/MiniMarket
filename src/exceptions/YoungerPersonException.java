package exceptions;

public class YoungerPersonException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String typeOfId; 
	public YoungerPersonException(String typeOfId)
	{
		super("The person is of legal age ");	
		this.typeOfId = typeOfId;
	}
	public String getTypeOfId() {
		return typeOfId;
	}
	
	
}
