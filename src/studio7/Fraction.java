package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction reciprocal() {
		Fraction f1 = new Fraction(this.denominator,this.numerator);
		return f1;
	}
	public void printFraction() {
		System.out.println(this.numerator + "/" + this.denominator);
	}
	public Fraction multiply(Fraction f2) {
		Fraction f1 = new Fraction(this.numerator * f2.numerator, this.denominator * f2.denominator);
		return f1;
	
	}
	public Fraction add(Fraction f2) {
		Fraction f1 = new Fraction(this.numerator * f2.denominator + this.denominator*f2.numerator, this.denominator * f2.denominator);
		return f1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(3,5);
		Fraction f2 = new Fraction(6,10);
		f1.printFraction();
		f2.printFraction();
		Fraction f3 = f1.reciprocal();
		f3.printFraction();
		Fraction f4 = f1.multiply(f2);
		f4.printFraction();
		
		Fraction f5 = f1.add(f2);
		f5.printFraction();

	}

}
