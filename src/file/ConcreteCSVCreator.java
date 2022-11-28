package file;

import java.io.IOException;

public class ConcreteCSVCreator extends Creator {
	public Product factoryMethod() {
		//return new Product();
		ConcreteCSVProduct p = null;
		try {
			p = new ConcreteCSVProduct();	
		}
		catch (IOException ex) {
			System.out.println("[!] failed to contruct CSVCreator");
		}
		
		return p;
	}
}
