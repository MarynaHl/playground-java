import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int a =  scanner.nextInt();
       int b = scanner.nextInt();
       int h = scanner.nextInt();

               if (a <= b && a < h) {
                   System.out.println("Impossible");
                   return;
               }

               int heigh = 0;
               int days = 0;

               while (true) {
                   days++;
                   heigh += a;

                   if (heigh >= h) {
                       System.out.println(days);
                       break;

                   }
                   heigh -= b;
               }

   }
}