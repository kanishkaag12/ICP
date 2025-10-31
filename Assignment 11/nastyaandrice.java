import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            int d = sc.nextInt(); 

            int minGrainWeight = a - b;
            int maxGrainWeight = a + b;
            int minTotal = n * minGrainWeight;
            int maxTotal = n * maxGrainWeight;

            int minAllowed = c - d;
            int maxAllowed = c + d;

            if (maxTotal < minAllowed || minTotal > maxAllowed) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

        sc.close();
    }
}