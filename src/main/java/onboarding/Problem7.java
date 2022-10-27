package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user,
                                        List<List<String>> friends,
                                        List<String> visitors) {
        Map<String, List<String>> relationMap = createRelation(friends);
        List<String> userRelations = relationMap.get(user);

        return null;
    }

    private static Map<String, List<String>> createRelation(List<List<String>> friends) {
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> friend : friends) {
            addToMap(map, friend.get(0), friend.get(1));
            addToMap(map, friend.get(1), friend.get(0));
        }
        return map;
    }

    private static void addToMap(Map<String, List<String>> map, String key,
                                 String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

}
