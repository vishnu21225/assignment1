/**
 * @author vamshikrishna Bandari
 *
 */
abstract class Ab{
	final double pi = 3.14;
	abstract double circleArea(double val);
	abstract double squareArea(double val);	
}
class Tesst extends Ab{
	double circleArea(double val){
		return pi* val*val;
	}
	double squareArea(double val){
		return val*val;
	}
}

public class Abst {

	public static void main(String[] args) {
		Tesst tob = new Tesst();
		System.out.println("circle area\t= "+ tob.circleArea(25)); 
		System.out.println("Square area\t= "+ tob.squareArea(25)); 
	}

}
