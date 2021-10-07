package model;

public class Person {

	
	private TypeOfId typeOfId;
	private String id;
	
	public Person(String typeOfId, String id)
	{
		this.id = id;
		this.typeOfId = TypeOfId.valueOf(typeOfId);
	}

	public String getTypeOfId() {
		return typeOfId.name();
	}

	public String getId() {
		return id;
	}
	
	
	
}
