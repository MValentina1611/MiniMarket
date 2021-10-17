package ui;

import java.time.LocalDate;
import java.util.Scanner;

import exceptions.WrongDayException;
import exceptions.YoungerPersonException;
import model.MiniMarket;

public class MiniMarketSystem {

	private Scanner reader;
	private MiniMarket miniMarket;
	
	public MiniMarketSystem()
	{
		reader = new Scanner(System.in);
		miniMarket = new MiniMarket();
	}
	
	public static void main(String args[])
	{
		System.out.println("The App is initializing...");
		
		MiniMarketSystem mms = new MiniMarketSystem();  
		
		 int menuOp = 0;

			do
			{
				menuOp = mms.showMenu();
				mms.executeOptions(menuOp);

			}while( menuOp != 0 );
			
		
	}
	
	public int showMenu()
	{
		int menuOp = 0;

		String menu = 
			"===== WELCOME TO THE MINIMARKET MI BARRIO TE QUIERE =====\n" +
			"Pick an option \n" +
			"(1) Register a person\n" +
			"(2) Number of people who have tried to enter\n"+								
			"(0) Exit";
		
		System.out.println(menu);
		menuOp = reader.nextInt();
		reader.nextLine();
		return menuOp;

	}//Method ends
	
	public void executeOptions( int option )
	{
		switch( option ) 
		{

			case 0:
				System.out.println ("BYE :*");
				break;
			case 1:
				askForInfo();
				break;
	
			case 2:
				showNumberOfPeople();
				break;
		
			default:
				System.out.println("Error, invalid option");
				
		}//Switch ends
		
	}//Method ends
	
	public void askForInfo() 
	{
		String typeOfId = "";
		String id = "";
		int today = LocalDate.now().getDayOfMonth();
		System.out.println("Enter the type of Id");
		typeOfId = reader.nextLine();
		
		System.out.println("Enter the id");
		id = reader.nextLine();
		
		try { 
			miniMarket.registerPeople(typeOfId, id, today);
			System.out.println("¡Welcome, come in!");
		}
		catch(YoungerPersonException ype )
		{
			System.err.println(ype.getMessage());
			if( miniMarket.verifyDay(id, today) == false )
			{
				WrongDayException wde = new WrongDayException(id);
				System.err.println(wde.getMessage());
			}
		}
		catch( WrongDayException wde )
		{
			System.err.println(wde.getMessage());
		}
		
	}
	
	
	public void showNumberOfPeople()
	{
		System.out.println("The number of people who have tried to enter is: " +miniMarket.getCounter());
	}
}
