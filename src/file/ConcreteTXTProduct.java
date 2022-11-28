package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;
import file.Product;

public class ConcreteTXTProduct extends Product {
	BufferedWriter out = null;
	
	public ConcreteTXTProduct() throws IOException {
		this.out = new BufferedWriter(new FileWriter("C:\\Users\\Student\\fzb.txt"));
	}

	@Override
	public void fuegeInDateiHinzu(Object object) throws IOException {
		// TODO Auto-generated method stub
		Freizeitbad fzb = (Freizeitbad)object;
		String s = "";
		
		s = "Daten des Freizeitbades\n"
		  + "Name des Freizeitbads: " + fzb.getName() + "\n"
		  + "Öffnungszeit des Freizeitbads: " + fzb.getGeoeffnetVon() + " - " + fzb.getGeoeffnetBis() + "\n"
		  + "Beckenlänge des Freizeitbads: " + fzb.getBeckenlaenge() + "\n"
		  + "Wassertemperatur des Freizeitbads" + fzb.getTemperatur() + "\n";
		
		this.out.write(s);
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		this.out.close();
		this.out = null;
	}

}
