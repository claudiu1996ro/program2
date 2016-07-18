package HorseRace;


/**
 * 
 * This class contains the main routine that initiates the multi-threaded
 * horse race simulation.
 * 
 * @author Jonathan Engelsma (http://www.cis.gvsu.edu/~engelsma)
 *
 */
public class HorseRaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException
	{

		// Create a race instance and a water trough for the thirsty race horses.
		Race race = new Race();
		WaterTrough trough = new WaterTrough();
		
		// spin off four eager horses!
		new Thread(new Horse("Saptalau",race,trough)).start();
		new Thread(new Horse("MiNu",race,trough)).start();
		new Thread(new Horse("Serbalau",race,trough)).start();		
		new Thread(new Horse("Mircea",race,trough)).start();			
		
		// Ok, now we need to wait a bit to make sure each thread gets off to the finish line...
		System.out.print("Pe locuri...");
		Thread.sleep(2000);
		System.out.print("Fiti gata...");
		Thread.sleep(2000); 
		System.out.println("START!!");
		race.startRace();

	}

}
