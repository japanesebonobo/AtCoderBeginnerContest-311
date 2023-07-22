import java.util.*;

public class A_FirstABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        scanner.close();
        int ans = 0;
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        for (int i = 0; i < N; i++) {
            if (s[i] == 'A') {
                cntA ++;
            }
            if (s[i] == 'B') {
                cntB ++;
            }
            if (s[i] == 'C') {
                cntC ++;
            }
            if (cntA >= 1 && cntB >= 1 && cntC >= 1) {
                ans = i+1;
                System.out.println(ans);
                System.exit(0);
            }
        }
    }
}

