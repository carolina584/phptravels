package net.phptravels.interactions;

import net.phptravels.utils.ReadExcelFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class File implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		try{
			ReadExcelFile.readDataActor();
			
		}
		catch(Exception e) {
			 
		}
		
	}
	
	public static File onFile() {
		return new File();
	}

}
