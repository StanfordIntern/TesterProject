import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xNums = input.nextInt();
        ArrayList<Integer> listNums = new ArrayList<>();
        for (int i = 0; i < xNums; i++) {
            int newNum = input.nextInt();
            listNums.add(newNum);
        }
        Collections.sort(listNums);
        System.out.println(listNums);
    }
}
