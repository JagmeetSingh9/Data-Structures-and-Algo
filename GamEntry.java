/*Q. Create an application that store a sequence of high score entries(with name and score) for a video game in an array.

        A Java class, GameEntry, representing a game entry is as follows:-
public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    // Getter methods that returns the name and score
    public int getScore() { return score; }
    public String getName() { return name; }
    // here i am returning a string representation of the entry
    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }
}

Hint :- Sorting

 */
import java.util.Arrays;
import java.util.Scanner;

public class GamEntry {
    private int score;
    private String name;
    public GamEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    public int getScore() { return score; }
    public String getName() { return name; }
    public String toString() {
        return "("+score+", "+ name+ ")";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         GamEntry arr[]=new GamEntry[3];
        for (int i = 0; i < 3; i++) {
            int s=sc.nextInt();
            sc.nextLine();
            String n=sc.nextLine();
            arr[i]=new GamEntry(s,n);
        }
        for(int i=0;i<3;i++) {
            for (int j = i; j < 3; j++) {
                if (arr[i].getScore() < arr[j].getScore()) {
                    GamEntry temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }

            }
            System.out.print(arr[i].toString()+" ");
        }
    }
}
