package se.sylog.componenttest;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPersonalPrinter one = new MyPersonalPrinter(false);
		one.setToPrint("----------------------------\n");		
		one.printToPrint();
		one.setToPrint("- blahablaha               -\n");		
		one.printToPrint();
		one.setToPrint("- ........................ -\n");		
		one.printToPrint();
		one.setToPrint("----------------------------\n");		
		one.printToPrint();
		
		// Starting to setup a application... 
		
		
		
	}

}
