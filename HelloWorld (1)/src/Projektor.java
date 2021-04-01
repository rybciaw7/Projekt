
public class Projektor {
	int name;
	
	public int dodaj( int a, int b ){
		int c = a + b;
		po_zmianie();
		return c;
		
	}

		
	public int odejmij( int a, int b ){
		int c = a - b;
		po_zmianie();
		return c;
		
	}


	private void po_zmianie() {
		System.out.println( "Sukces" );
	}
	
	
	public int getName() {
		return name;
	}


	public void setName(int name) {
		this.name = name;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a = 1, b = 2, c = 3, d = 4, e = 5;
		System.out.println( "Hello World" );
		
		
		if( a == 1 )
		if( d == 4 )
		b = 3;
		else
		c = 4;	
	}

}