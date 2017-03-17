package se.sylog.componenttest;

public class MyPersonalPrinter {
	String toPrint;
	
	MyPersonalPrinter(boolean b) {
		if (b) {
			System.out.println("Created object MyPersonalPrinter");
		}
		toPrint = "";
	}
	
	MyPersonalPrinter() {
		toPrint = "";
	}

	public String getToPrint() {
		return toPrint;
	}

	public void setToPrint(String toPrint) {
		this.toPrint = toPrint;
	}
	
	public void printToPrint() {
		System.out.println(toPrint);
	}
	
	public String toString() {
		return toPrint;
	}

}
