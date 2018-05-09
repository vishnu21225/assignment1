/**
 * @author vamshikrishna Bandari
 *
 */
class Volume{
	double l,h;
	final double pi = 3.14;
	Volume(double a,double b){
		l=a;
		h=b;
	}
	void vol(){
		System.out.println("general volume" );
	}	
}

class Vol1 extends Volume{
	Vol1(double a, double b) {
		super(a, b);
	}

	void vol(){
		System.out.println("Cone volume  " + pi*l*h*h/3 );
	}
}

class Vol2 extends Volume{

	Vol2(double a, double b) {
		super(a, b);
	}
	void vol(){
		System.out.println("Prism volume  "+ l*l*h );
	}
}

public class Over {

	public static void main(String[] args) {
		Volume vob = new Volume(8.6,69.6);
		vob.vol();
		Volume v1ob = new Vol1(20.6,35.69);
		v1ob.vol();
		Volume v2ob = new Vol2(33.52,45.5);
		v2ob.vol();
	}

}
