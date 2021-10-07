import java.io.*;
import java.util.*;

public class Day6LetsReview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= t; i++) {
            String s = scan.nextLine();
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if ((j + 1) % 2 == 1) {
                    odd.append(s.charAt(j));
                } else if ((j + 1) % 2 == 0) {
                    even.append(s.charAt(j));
                }
            }
            System.out.println(odd + " " + even);
        }

    }
}
