package arefriends;
/* @author sumeyral

 */
import java.util.Scanner;

public class AreFriends {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int n1 = Integer.parseInt(kb.nextLine());
        System.out.println("İkinci sayıyı giriniz:");
        int n2 = Integer.parseInt(kb.nextLine());

        System.out.println(NumberUtil.areFriends(n1,n2) == true ? "Arkadaş sayılar" : "Sayılar arkadaş değil");

    }
}

class NumberUtil {
    public static boolean areFriends(int x, int y) {
        if (y == sumFactors(x) && x == sumFactors(y))
            return true;
        else
            return false;
    }

    public static int sumFactors(int val) {
        int sum = 1;

        if (val == 1)
            return sum;
        else {
            for (int i = 2; i < val; i++) {
                if (val % i == 0)
                    sum += i;
            }
            return sum;
        }

    }
}
