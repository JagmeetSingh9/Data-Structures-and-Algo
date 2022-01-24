/*Q6. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print  the first occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

The prototype of the method is as follows:-

public static int[] find(int arr[], int current index, int search_value)
{
	// set of statements;
}*/public class occurence {
    public static void find(int arr[],int i,int search_value){
        if(arr[i]==search_value){
            System.out.println(i);
            return;
        }
        find(arr,i+1,search_value);

    }
    public static void main(String[] args) {
        int[] arr={1,5,4,9};
        find(arr,0,9);
    }
}
