package file;

import java.io.IOException;

public class ConcreteTXTCreator extends Creator {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		ConcreteTXTProduct p = null;
		try {
			p = new ConcreteTXTProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

}
