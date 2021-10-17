package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exceptions.WrongDayException;
import exceptions.YoungerPersonException;

class MiniMarketTest {

	private MiniMarket miniMarketForTest;
	
	public void setUpScenary1()
	{
		miniMarketForTest = new MiniMarket();
	}
	
	public void setUpScenary2()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(1);
	}
	
	public void setUpScenary3()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(2);
	}
	
	public void setUpScenary4()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(3);
	}
	
	public void setUpScenary5()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(4);
		Person p = new Person(TypeOfId.valueOf("CC"), "1245");
		miniMarketForTest.getPeople().add(p);
	}
	
	public void setUpScenary6()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(5);
		Person p = new Person(TypeOfId.valueOf("CC"), "1245");
		miniMarketForTest.getPeople().add(p);
	}
	
	public void setUpScenary7()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(6);
		Person p = new Person(TypeOfId.valueOf("CC"), "1245");
		miniMarketForTest.getPeople().add(p);
	}
	
	public void setUpScenary8()
	{
		miniMarketForTest = new MiniMarket();
		miniMarketForTest.setCounter(7);
		Person p = new Person(TypeOfId.valueOf("CC"), "1245");
		miniMarketForTest.getPeople().add(p);
	}
	//--------------------------------------------------------------------------------------
	@Test
	public void testRegisterPeople1() 
	{
		setUpScenary1();
		
		String typeOfId = "TI";
		String id = "1234";
		int today = 17;
		try {
			miniMarketForTest.registerPeople(typeOfId,id, today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id, today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(1, counter);
	}

	@Test
	public void testRegisterPeople2() 
	{
		setUpScenary2(); 
		
		String typeOfId = "TI";
		String id = "1245";
		int today = 17;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id,today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id,today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(2, counter);
		
	}
	
	@Test
	public void testRegisterPeople3() 
	{
		setUpScenary3(); 
		
		String typeOfId = "CC";
		String id = "1234";
		int today = 17;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id,today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id,today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(3, counter);
		
	}
	
	@Test
	public void testRegisterPeople4() 
	{
		setUpScenary4(); 
		
		String typeOfId = "CC";
		String id = "1245";
		int today = 17;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id,today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id,today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(4, counter);
		
		ArrayList<Person> people = miniMarketForTest.getPeople();
		
		Person p = people.get(0);
		assertEquals("1245",p.getId());
		assertEquals("CC",p.getTypeOfId());
		
	}
	
	@Test
	public void testRegisterPeople5() 
	{
		setUpScenary5(); 
		
		String typeOfId = "TI";
		String id = "1264";
		int today = 16;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id, today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id, today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(5, counter);
		
	}
	
	@Test
	public void testRegisterPeople6() 
	{
		setUpScenary6(); 
		
		String typeOfId = "TI";
		String id = "1234";
		int today = 16;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id, today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id, today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(6, counter);
		
	}
	
	@Test
	public void testRegisterPeople7() 
	{
		setUpScenary7(); 
		
		String typeOfId = "CC";
		String id = "1264";
		int today = 16;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id, today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id, today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(7, counter);
		
	}
	
	@Test
	public void testRegisterPeople8() 
	{
		setUpScenary8(); 
		
		String typeOfId = "CC";
		String id = "1234";
		int today = 16;
		
		try {
			miniMarketForTest.registerPeople(typeOfId,id,today);
		} catch (YoungerPersonException e) {
			
			e.printStackTrace();
			if( miniMarketForTest.verifyDay(id,today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				wde.printStackTrace();
			}
		} catch (WrongDayException e) {
			
			e.printStackTrace();
		}
		int counter = miniMarketForTest.getCounter();
		assertEquals(8, counter);
		
		ArrayList<Person> people = miniMarketForTest.getPeople();
		
		Person p = people.get(1);
		assertEquals("1234",p.getId());
		assertEquals("CC",p.getTypeOfId());
		
	}
}
