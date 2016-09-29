
public class Fraction {

	private String name;
	private int numerator;
	private int denominator;
	
	public Fraction (String name, int numerator, int denominator){
		this.name = name;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNumerator(){
		return this.numerator;
	}
	
	public int getDenominator(){
		return this.denominator;
	}
	
	public String add(Fraction other){
		return this.name + " and " + other.name + " can be added together to equal " + ((this.numerator * other.denominator) + (other.numerator * this.denominator)) + "/" + (this.denominator * other.denominator);
	}
	
	public String multiply(Fraction other){
		return this.name + " can be multiplied by " + other.name + " to equal " + (this.numerator * other.numerator) + "/" + (this.denominator * other.denominator);
	}
	
	public String reciprocal(){
		return this.name + ", when multiplied by it's reciprocal, " + this.denominator + "/" + this.numerator + ", becomes " + (this.numerator * this.denominator) + "/" + (this.denominator * this.numerator);
	}
	
	public String toString(){
		return this.name + ": " + this.numerator + "/" + this.denominator;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fractionOne = new Fraction ("fractionOne", 3, 5);
		System.out.println(fractionOne);
		System.out.println();
		Fraction fractionTwo = new Fraction ("fractionTwo", 6, 8);
		System.out.println(fractionTwo);
		System.out.println();
		System.out.println(fractionOne.add(fractionTwo));
		System.out.println();
		System.out.println(fractionOne.multiply(fractionTwo));
		System.out.println();
		System.out.println(fractionOne.reciprocal());
		System.out.println();
		System.out.println(fractionTwo.reciprocal());
		
	}

}
