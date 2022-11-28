package file;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;

public class ConcreteCSVProduct extends Product {
	
	BufferedWriter out = null;
	
	public BufferedWriter getOut() {
		return out;
	}

	public void setOut(BufferedWriter out) {
		this.out = out;
	}

	public ConcreteCSVProduct() throws IOException {
		// construct BufferedReader
		this.out = new BufferedWriter(new FileWriter("C:\\Users\\Student\\fzb.csv"));
	}
	
	public void fuegeInDateiHinzu(Object object) throws IOException {
		// do sth...
		// write object to file...
		Freizeitbad fzb = (Freizeitbad)object;
		
		String s = fzb.getName() + ";" +
				   fzb.getGeoeffnetVon() + ";" +
				   fzb.getGeoeffnetBis() + ";" +
				   fzb.getBeckenlaenge() + ";" + 
				   fzb.getTemperatur() + ";" //+ "\n"
				   ;
		
		this.out.write(s);
		
	}
	
	public void schliesseDatei() throws IOException {
		// close br
		this.out.close();
		this.out = null;
	}
	
}
