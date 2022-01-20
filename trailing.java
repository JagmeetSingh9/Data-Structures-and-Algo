import java.util.Scanner;

public class trailing {
    public static void main(String[] args) {
        long i, fact = 1,c=0;
        long number = 20;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
            Scanner sc = new Scanner(System.in);
            trailing tr = new trailing();
        for ( i = 0; i < number; i++) {
            if(fact%10==0) {
                fact=fact/10;
                c++;
                }
            }
        System.out.println(c);

        }
}


