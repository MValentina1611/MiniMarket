package model;

import java.util.ArrayList;

import exceptions.WrongDayException;
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

	
	public void setCounter(int counter) {
		this.counter = counter;
	}

	
	public ArrayList<Person> getPeople() {
		return people;
	}

	public void registerPeople(String typeOfId, String id, int today) throws YoungerPersonException, WrongDayException
	{
		counter++;
		if( typeOfId.equalsIgnoreCase("ti"))
		{
			throw new YoungerPersonException(typeOfId);
		}
		else
		{
			if( verifyDay(id,today) == false )
			{
				throw new WrongDayException(id);
			}
			else
			{	
				Person newPerson = new Person(TypeOfId.valueOf(typeOfId.toUpperCase()), id);
				people.add(newPerson);
			}
		}
		
	}
	
	public boolean verifyDay(String id, int today)
	{
		//int today = LocalDate.now().getDayOfMonth();
		
		int penultimate = Character.getNumericValue(id.charAt(id.length()-2));
		
		boolean canGoOut = false;
		
		if( penultimate % 2 == 0 )
		{
			if( today % 2 ==  0 )
			{
				canGoOut = false;
			}
			else if( today % 2 != 0 )
			{
				canGoOut = true;
			}
		}
		else if( penultimate % 2 != 0 )
		{
			if( today % 2 == 0)
			{
				canGoOut = true;
			}
			else if( today % 2 != 0 )
			{
				canGoOut = false;
				
			}
		}
		return canGoOut;
	}
	
}
