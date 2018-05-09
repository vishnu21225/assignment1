/**
 * @author vamshikrishna Bandari
 *
 */
class Suptest{
	int credit = 3;
	String ae = "English" ;
	public int i=25,exceed =0;
	
	void number(int a){
		if(a>=25){
			exceed =1;
		}
	}
	
	void display(){
		if(exceed == 1){
			System.out.println("Course overfloated");
		}
		else{
			System.out.println("Course cannot overfloated");
		}
	}
}

public class Supe {

	public static void main(String[] args) {
		Suptest sob = new Suptest();
		sob.number(15);
		sob.display();
		sob.number(25);
		sob.display();
	}

}
