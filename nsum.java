/*Q2. Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6*/public class nsum {
        public  static void printsum(int n,int sum) {


        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum+=n;

        printsum(n -1,sum);
    }

    public static void main(String[] args) {
        //int n = 5000;
        //countdigit cd=new countdigit();
        printsum(6,0);

    }
}

