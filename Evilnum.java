import java.util.Scanner;

public class Evilnum {

    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int binary = 0;
        int i = 1;
        int rem = 0;

        while (temp != 0) {
            rem = temp % 2;
            binary += rem * i;
            temp /= 2;
            i *= 10;

        }
        System.out.println("the binary form of the given integer " + a + " is " + binary);
        int f = binary;
        int count = 0;
        while (f != 0) {
            if (f % 10 == 1) {
                count++;
            }
            f /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("the given number is evil number ");
        } else
            System.out.println("the number is not evilnumber and it is odious number ");
        sc.close();
    }

}
