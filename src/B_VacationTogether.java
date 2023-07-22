import java.util.*;

public class B_VacationTogether {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        char s [][] = new char[N][D];
        for (int i = 0; i < N; i++) {
            s[i] = scanner.next().toCharArray();
        }
        scanner.close();
        
        
        int cnt = 0;
        int maxCnt = 0;
        for (int i = 0; i < D; i++) {
            int vacantFlag = 1;
            for (int j = 0; j < N; j++) {
                if (s[j][i] == 'x') {
                    vacantFlag = 0;
                }
            }
            if (vacantFlag == 1) {
                cnt++;
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                }
            }
            if (vacantFlag == 0) {
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                }
                cnt=0;
            }
        }
        System.out.println(maxCnt);
    }
}

