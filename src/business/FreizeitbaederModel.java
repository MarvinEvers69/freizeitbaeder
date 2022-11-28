package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import file.ConcreteCSVCreator;
import file.ConcreteCSVProduct;
import file.ConcreteTXTCreator;
import file.ConcreteTXTProduct;
import file.Creator;
import file.Product;



public class FreizeitbaederModel {

    private Freizeitbad freizeitbad;

    
   /* 
	public void schreibeFreizeitbaederInCsvDatei() {
		// Throw exception
		
		try {
			BufferedWriter aus = new BufferedWriter(new FileWriter("Freizeitbaeder.csv", true));
			aus.write(this.getFreizeitbad().gibFreizeitbadZurueck(';'));
			aus.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
    
    public void schreibeFreizeitbaederInCsvDatei() throws IOException {
    	System.out.println("[DBG] writing CSV.");
    	Creator c = new ConcreteCSVCreator();
    	//Product p = new ConcreteCSVProduct();
    	
    	Product writer = c.factoryMethod();
    	writer.fuegeInDateiHinzu(this.freizeitbad);
    	writer.schliesseDatei();
    }
    
    public void schreibeFreizeitbaederInTxtDatei() throws IOException {
    	System.out.println("[DBG] writing TXT.");
    	Creator c = new ConcreteTXTCreator();
    	//Product p = new ConcreteCSVProduct();
    	
    	Product writer = c.factoryMethod();
    	writer.fuegeInDateiHinzu(this.freizeitbad);
    	writer.schliesseDatei();
    }
    



	public Freizeitbad getFreizeitbad() {
		return freizeitbad;
	}



	public void setFreizeitbad(Freizeitbad freizeitbad) {
		this.freizeitbad = freizeitbad;
	}

}
