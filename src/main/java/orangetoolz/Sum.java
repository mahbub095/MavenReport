package orangetoolz;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        x = myObj.nextInt();
        System.out.println(" ");
        y = myObj.nextInt();
        sum = x + y;
        System.out.println("" + sum);
    }
}
