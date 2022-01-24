import java.util.Scanner;

/*Q1. Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81*/public class solution  {
    static int sum=0;

    public static void sumofArray(int arr[],int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;   
        }
        int y=sum+arr[n-1];
        sumofArray(arr,n-1,y);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumofArray(arr,n,0);
    }
}