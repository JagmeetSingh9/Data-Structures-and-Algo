import java.util.ArrayList;
import java.util.Scanner;

public class oddelements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   if(arr[i][j]%2==0){
                       l1.add(arr[i][j]);
                   }
                   else{
                       l2.add(arr[i][j]);

                   }

                }
                }
        System.out.println(l1);
        System.out.println(l2);
    }

        }

