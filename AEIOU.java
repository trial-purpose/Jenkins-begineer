import java.util.Scanner;

public class AEIOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = sc.next();
        int count =0;
        String s1 = "AEIOUaeiou";

        for (int i=0; i < s.length(); i++){
            if(s1.contains(String.valueOf(s.charAt(i)))){
                count++;
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("\nNumber of vowels: " + count);
    }
}
