/**
 * @author vamshikrishna Bandari
 *
 */
import java.util.Scanner;
public class Health {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		double a[][]= new double[10][2];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter Student" + i +"  height and weight\n");
			for(int j=0;j<a[i].length;j++){
				a[i][j] = inp.nextDouble();
			}
		}
		double maxh=a[0][0],minh=a[0][0],ah=0,bh=0;
		for(int i=0;i<a.length;i++){
			if(maxh<a[i][0]){
				maxh =a[i][0];
				ah=i;
			}
			if(minh>a[i][0]){
				minh = a[i][0];
				bh=i;
			}
			
		}
		System.out.println("\nMaximum Height is student" +ah+" = " +maxh+"\n\n minimum height is student"+bh+" = "+minh);
		double maxw=a[0][1],minw=a[0][1],aw=0,bw=0;
		for(int i=0;i<a.length;i++){
			if(maxw<a[i][1]){
				maxw =a[i][1];
				aw=i;
			}
			if(minw>a[i][1]){
				minw = a[i][1];
				bw=i;
			}
			
		}
		System.out.println("\nMaximum weight is student" +aw +" =  "+maxw+"\n\n minimum weight is student"+bw+" =  "+minw);
					
	}

}
