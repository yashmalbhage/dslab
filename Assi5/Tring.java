import java.util.Scanner;

public class Tring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of nodes");
        int n = sc.nextInt();

        int token = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(" " + i);
        }
        System.out.println(" " + 0);

        try {
            while (true) {
                System.out.println("Enter sender");
                int s = sc.nextInt();
                System.out.println("Enter reciever");
                int r = sc.nextInt();
                System.out.println("Enter data");
                String d = sc.next();

                System.out.println("Token passing");

                for (int i = token, j = token; (i % n) != s; i++, j = (j + 1) % n) {
                    System.out.println(" " + j + "=>");
                }
                System.out.println("sender " + s + "sending data" + d);

                for (int i = (s + 1) % n; i != r; i = (i + 1) % n) {
                    System.out.println("data" + d + "forwarded by" + i);
                }
                System.out.println("reciever" + r + "recieved data " + d);
                token = s;
            }

        } catch (Exception e) {
            System.out.println("Error occured" + e.getMessage());
        }

    }
}