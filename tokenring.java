import java.util.*;

class TokenRing {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = scan.nextInt();

        int token = 0;
        int choice;

        // Display ring structure
        System.out.println("\nRing Structure:");

        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
        }

        System.out.println("0");

        do {

            System.out.print("\nEnter sender node: ");
            int s = scan.nextInt();

            System.out.print("Enter receiver node: ");
            int r = scan.nextInt();

            if (s >= n || r >= n || s < 0 || r < 0) {
                System.out.println("Invalid node number!");
                continue;
            }

            System.out.print("Enter data: ");
            int data = scan.nextInt();

            // Token passing
            System.out.print("\nToken Passing: ");

            for (int i = token; i != s; i = (i + 1) % n) {
                System.out.print(i + " -> ");
            }

            System.out.println(s);

            System.out.println("\nSender " + s +
                    " sending data: " + data);

            // Data forwarding
            for (int i = (s + 1) % n; i != r; i = (i + 1) % n) {
                System.out.println(
                    "Data forwarded by node " + i
                );
            }

            System.out.println(
                "Receiver " + r +
                " received data: " + data
            );

            // Update token position
            token = s;

            System.out.print(
                "\nDo you want to send again? (1 = Yes, 0 = No): "
            );

            choice = scan.nextInt();

        } while (choice == 1);

        scan.close();
    }
}
