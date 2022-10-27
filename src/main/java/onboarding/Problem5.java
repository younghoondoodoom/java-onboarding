package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

    private static void cntBills(int money, ArrayList<Integer> result) {
        int[] bills = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        while (money != 0) {
            for (int i = 0; i < bills.length; i++) {
                if (money - bills[i] >= 0) {
                    money -= bills[i];
                    result.set(i, result.get(i) + 1);
                    break;
                }
            }
        }
    }
}
