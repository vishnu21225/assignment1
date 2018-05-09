/**
 * @author vamshikrishna Bandari
 *
 */
import java.util.*;

public class Avgtemp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double rec[][] = new double [5][12];
		for(int i=0;i<rec.length;i++){
			for(int j=0;j<rec[i].length;j++){
				rec[i][j] = Math.random();
				System.out.print(rec[i][j]+ "\t");
			}
			System.out.println();
		}
		int sta=0,sta1=0;
		double max = rec[0][3]; 
		for(int i=0;i<rec.length;i++){
			for(int j=0;j<rec[i].length;j++){

				if((j==3)||(j==4)){
					if(max<rec[i][j]){
						max = rec[i][j];
						sta=i;
						sta1=j;
					}
				}
			}
		
		}
		System.out.println("highest temp state" +sta + " = "+ max+ "\tmonth"+(sta1+1));
		int stb1=0,stb2=0;
		double min = rec[0][0]; 
		for(int i=0;i<rec.length;i++){
			for(int j=0;j<rec[i].length;j++){

				if((j==0)||(j==12)){
					if(min>rec[i][j]){
						min = rec[i][j];
						stb1=i;
						stb2=j;
					}
				}
			}
		
		}
		System.out.println("lowest temp state" + stb1 + " =  "+ min+ "\t month"+(stb2+1));

	}
}