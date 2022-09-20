import static java.lang.Math.*;
import java.util.Random;
    public class Lb1 {
    public static void main(String []args) {
        short[] a = new short[17];
        short k = 20;
        for (int i=0; i < a.length; i++) {
            a[i] = k;
            k-=1;
        }
        Random Ran = new Random();
        double[] x = new double[11];
        for (int i=0; i < x.length;i++){
            x[i] = Ran.nextDouble(14)-5;
        }
        double [][] c = new double[17][11];
        for (int i=0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if (a[i] == 11) {
                    c[i][j] = atan(pow(1/exp(abs(x[j])), 2));
                }
                else if (a[i] == 4 | a[i] == 6 | a[i] == 7 | a[i] == 10 | a[i] == 13 | a[i] == 16 | a[i] == 18 | a[i] == 19) {
                    c[i][j] = exp(pow(exp(x[j])*(exp(x[j])-PI), 2));
                }
                else c[i][j] = pow((tan(log(exp(x[j]))) + 2) / 12, 2);
            }
        }
        for (int i=0; i < c.length; i++){
            for (int j=0; j < c[0].length; j++){
                System.out.printf("%.2f\t", c[i][j]);
            }
            System.out.println(" ");
        }
    }
}