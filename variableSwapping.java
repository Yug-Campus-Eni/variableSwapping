package cours;

public class variableSwapping {
	
	public static void intVariableSwapping(int x, int y) {
		// DECLARING 
		System.out.println("(INSIDE METHODE)BEFORE SWAPPING X equals to : " + x + " and Y equals :" + y);
		int tmp; // DECLARING tmp
		
		// VARIABLE SWAPPING
		tmp = x;
		x = y;
		y = tmp;		
		System.out.println("(INSIDE METHODE)AFTER SWAPPING X equals to : " + x + " and Y equals :" + y);
		
	} // FIN FONCTION SWAPPING 	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
			// INTIALIZING VARIABLES
			int x = 5;
			int y = 10;
			System.out.println("(INSIDE MAIN) BEFORE SWAPPING X equals to : " + x + " and Y equals :" + y);
			intVariableSwapping(x, y);
			System.out.println("(INSIDE MAIN)AFTER SWAPPING X equals to : " + x + " and Y equals :" + y);
			
		
	} // FIN MAIN

}// FIN CLASS 
