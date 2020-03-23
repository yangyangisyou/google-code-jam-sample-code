import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // input tools
        Scanner sc = new Scanner(System.in);
        // I highly recommend using custom scanner.
        // Input input = new input();
        int testCase = sc.nextInt();
        for(int caseNo = 1; caseNo<=testCase; caseNo++) {
            // solve your code
            int a = sc.nextInt();
            int b = sc.nextInt();
            // output
            System.out.println("Case #"+caseNo+": "+a+" "+b);
        }
    }

}