/**
 * @author vamshikrishna Bandari
 *
 */


interface InfaceA{
	final double u = 3.986004418* Math.pow(10, 5) ;
	double getVel(double r);
}

interface InfaceB extends InfaceA{
	double getAcc(double r);
}

class Testp implements InfaceA,InfaceB{
	public double getVel(double r){
		return Math.sqrt(u/r);
	}
	public double getAcc(double r){
		return (u/(r*r));
	}
}

public class Testve {

	
	public static void main(String[] args) {
		Testp tob = new Testp();
		InfaceA ob1;
		InfaceB ob2;
		ob1 = tob;
		System.out.println("velocity of satelite = "+ob1.getVel(22.3));
		ob2 = tob;
		System.out.println("Acceleration of Satelite = "+ob2.getAcc(5.69));

	}

}
