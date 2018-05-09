/**
 * @author vamshikrishna Bandari
 *
 */
// interface class having one method to reverse a number

interface Infacex{
	int reve(int n);
}

class Test implements Infacex{
	public int reve(int n){
		int re=0,s;
		while(n!=0){
			s = n % 10;
			re = re*10 + s;
			n = n/10;
		}
		return re;
	}
}
public class Rev {
	public static void main(String[] args){
		int a = 123456;
		Infacex iob;
		Test tob = new Test();
		iob = tob;
		int b = iob.reve(a);
		System.out.println(b);
	}

}
