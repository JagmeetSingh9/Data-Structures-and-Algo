/*Q3. Write a program to find out and return the number of digits present in a number recursively.

        Sample Input 1 :
        156
        Sample Output 1 :
        3
        Sample Input 2 :
        7
        Sample Output 2 :
        1
*/
public class countdigit {
    int count=0;
    public  void printsum(int n) {


        if(n==0) {
            System.out.println(count);
            return;
        }
        n=n/10;
        count++;
        print vvjhvsum(n);
    }

    public static void main(String[] args) {
        int n = 5000;
        countdigit cd=new countdigit();
        cd.printsum(n);

    }
}