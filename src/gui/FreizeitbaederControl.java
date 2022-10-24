package gui;

import java.io.IOException;

import business.Freizeitbad;
import business.FreizeitbaederModel;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class FreizeitbaederControl {
	
	private FreizeitbaederView fzbView;
	private FreizeitbaederModel fzbModel;
	
    public FreizeitbaederControl(Stage primaryStage) {
    	this.fzbModel = new FreizeitbaederModel();
    	this.fzbView = new FreizeitbaederView(this, primaryStage, fzbModel);
    }
	
	void schreibeFreizeitbaederInDatei(String typ) {
		System.out.println("[DBG] CONTROL tries to write to " + typ);
		try {
			if ("csv".contentEquals(typ)) {
				// Typs und Ausgabe der Meldung
				fzbModel.schreibeFreizeitbaederInCsvDatei();
			}
			else {
				fzbView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		}
		// ERR because of unreachable catch statement
		//catch (IOException exc) {
			//this.fzbView.zeigeFehlermeldungsfensterAn("504", "IOException beim Speichern!");
		//}
		catch (Exception exc) {
			this.fzbView.zeigeFehlermeldungsfensterAn("404", "Unbekannter Fehler beim Speichern!");
		}
	}

}