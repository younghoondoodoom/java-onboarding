package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!isValidData(pobi) || !isValidData(crong)) {
            return -1;
        }

        return 0;
    }

    private static boolean isValidData(List<Integer> list) {
        if (list.size() != 2) {
            return false;
        }
        if (list.get(0) % 2 != 1 || list.get(1) % 2 != 0) {
            return false;
        }
        if (list.get(0) == 1 || list.get(1) == 400) {
            return false;
        }
        return list.get(0) + 1 == list.get(1);
    }
}