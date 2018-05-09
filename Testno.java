/**
 * @author vamshikrishna Bandari
 *
 */
interface MeanIn{
	float mean(int a[]);
	float devi(int a[]);
}

class Cal implements MeanIn{
	
	public float mean(int a[]){
		float sum=0;
		for(int i=0;i<a.length;i++){
			sum +=a[i];
		}
		
		return sum/a.length;
	}
	
	public float devi(int a[]){
		float sum=0;
		for(int i=0;i<a.length;i++){
			sum +=a[i]*a[i];
		}
		
		return sum/a.length;
	}
}



public class Testno {

	public static void main(String[] args) {
		int ar[] = {1,3,5,7,9,11,13,15};
		Cal cob = new Cal();
		MeanIn ob;
		ob = cob;
		System.out.println("Mean of given array is =\t"+ob.mean(ar));
		System.out.println("\nDeviation of given array is =\t"+ob.devi(ar));

	}

}
