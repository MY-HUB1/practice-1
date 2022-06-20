package today;

public class tes {

	public static void main(String[] args) {
		Vege v1 = new chil();//upcasting
		v1.vege();
		//1st charecter of upcasting-----v1.chil();---error
		//2nd charecter of upcasting-----v1.vege();;Chilli logic execute
		chil c = (chil) v1;//-------->downcasting.
		
		Carr c1 = (Carr)v1;//------------>indicates class caste exception.
		
		

             
             
		
		
	}

}
