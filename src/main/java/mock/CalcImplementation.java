package mock;

public class CalcImplementation {
	CalcInterface calcInterface;
	
	public void setCalcInterface(CalcInterface calcInterface) {
		this.calcInterface = calcInterface;
	}
	
	public int addTwoNums(int a, int b) {
		return calcInterface.add(a, b);
	}
	
	public int subtractTwoNums(int a, int b) {
		return calcInterface.subtract(a, b);
	}
	
	public int multiplyTwoNums(int a, int b) {
		return calcInterface.multiply(a, b);
	}
	
	public double divideTwoNums(double a, double b) {
		return calcInterface.divide(a, b);
	}
	
}
