package file;

import java.io.IOException;

public abstract class Product {
	abstract public void fuegeInDateiHinzu(Object object) throws IOException;

	abstract public void schliesseDatei() throws IOException; 
}
