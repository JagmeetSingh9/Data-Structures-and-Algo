//Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent the name of the flower,
//its number of petals, and price.Your class must include a constructor method that initialises each variable to an appropriate value, and your class should include methods for setting the value of each type, and getting the value of each type. Create an array of 5 Flower objects and print the value.
import java.util.Scanner;

class Flower {

    int petals;
    String name;
    int price;
    Flower(int petals,String name,int price){
        this.petals=petals;
        this.name=name;
        this.price=price;

    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Flower[] arr = new Flower[2];
        for (int i = 0; i < 2; i++) {
            int p=sc.nextInt();
            sc.nextLine();
            String n=sc.nextLine();
            sc.nextLine();
            int pr=sc.nextInt();
            sc.next();
            arr[i]=new Flower(p,n,pr);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("name"+arr[i].name+"petals"+arr[i].petals+"price"+arr[i].price);
        }
    }
}