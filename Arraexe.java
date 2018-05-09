/**
 * @author vamshikrishna Bandari
 *
 */
import java.lang.*;
class arra
{
    void met1(int a[])throws ArrayIndexOutOfBoundsException{
        for(int i=0;i<=a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

public class Arraexe {
    public static void main(String[] arg)
    {
        int ar[]={5,20,30,0,100};
        arra obj=new arra();
        try{
            obj.met1(ar);
        }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("run time error-Array Index Out Of Bounds Exception");
       }
        finally{
            System.out.println("closing the main function ");
        }
    }
}