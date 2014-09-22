/**
 * Created by student on 22.09.2014.
 */
public class cikl {
    public static void main(String[] args) {
        for (int i=1; i<=100; i=i+1){
            if ((i%5==0)&&(i%7==0)) {
                System.out.println("ABBA");
            } else if (i%7==0) {
                System.out.println("B");
            } else  if (i%5==0) {
                System.out.println("A");
            } else {
                System.out.println(i);
            }
        }
    }
}
