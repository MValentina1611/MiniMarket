package model;

import java.time.LocalDate;
import java.util.ArrayList;
import exceptions.YoungerPersonException;

public class MiniMarket {

	private ArrayList <Person> people;
	private int counter;
	
	public MiniMarket()
	{
		people = new ArrayList<Person>();
		counter = 0;
	}

	public int getCounter() {
		return counter;
	}
	
	public void registerPeople(String typeOfId, String id) throws YoungerPersonException
	{
		
		if( typeOfId.equalsIgnoreCase(TypeOfId.TI.name()))
		{
			throw new YoungerPersonException(typeOfId);
		}
		//else
		//
			//if( LocalDate.now().getDayOfMonth() == )
			//{
				
			//}
			else
			{	
				Person newPerson = new Person( typeOfId, id);
				people.add(newPerson);
			}
		//}
		counter++;
	}
	
}
