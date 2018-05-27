
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n=scn.nextInt();
        int[] a=new int[n];
        for (int i=0; i< a.length;i++)

            a[i]=scn.nextInt();

        int[] b=new int [n-1];

        for (int i=0;i<b.length;i++){

            b[i]=a[i]*a[i+1];

            System.out.println(b[i]);

        }

        int maxvalue=-1000;

        for ( int i=0; i<b.length;i++)

            if (b[i]> maxvalue)

                maxvalue=b[i];

        System.out.println("max="+ maxvalue);


    }
}
