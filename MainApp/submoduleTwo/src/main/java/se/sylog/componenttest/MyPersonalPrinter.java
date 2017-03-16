package se.sylog.componenttest;

public class MyPersonalPrinter {
	String toPrint;
	
	MyPersonalPrinter() {
		System.out.println("Created object MyPersonalPrinter");
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
}
