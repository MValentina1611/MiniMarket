package model;

public class Person {

	
	private TypeOfId typeOfId;
	private String id;
	
	public Person(TypeOfId typeOfId, String id)
	{
		this.id = id;
		this.typeOfId = typeOfId;
	}

	public String getTypeOfId() {
		return typeOfId.name();
	}

	public String getId() {
		return id;
	}
	
	
	
}
