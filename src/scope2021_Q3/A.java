package scope2021_Q3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {

    public static void main(String[] args) {

        /*
         *
         *
         * 1110
         * 1110
         * 0110
         * 0000
         *
         * total     11
         * size1     8
         * size2     3
         *
         *
         * 배치가 가능한 공간을 list 에 담고
         *
         * list 를 돌며 각 포인트를 기준으로 size 만큼 공간이 있다면 추가
         *
         * */

        int N = 5;
        String[] input = new String[]{
//                "1110",
//                "1110",
//                "0110",
//                "0000"
                "11111",
                "11111",
                "11111",
                "11111",
                "11111",
        };

        List<String> vect = new ArrayList<>();

        int inputLen = input.length;
        for (int i = 0; i < inputLen; i++) {
            String[] line = input[i].split("");
            for (int j = 0; j < inputLen; j++) {
                if (line[j].equals("1")) {
                    vect.add(i + "," + j);
                }
            }
        }

        /*
         *
         * 포인트에서 경계선을 넘지 않는 선까지 size 를 1 씩 늘려가며 확인
         *
         * */

        Map<String, Integer> map = new HashMap<>();
        int vectLen = vect.size();
        for (int i = 0; i < vectLen; i++) {
            String[] pointXY = vect.get(i).split(",");
            int X = Integer.valueOf(pointXY[0]);
            int Y = Integer.valueOf(pointXY[1]);
            int cnt = 0;
            boolean res = true;
            for (int j = 1; ; j++) {
                if (X + j > vectLen) {
                    break;
                }
                for (int k = 0; k < j; k++) {
                    for (int l = 0; l < j; l++) {
                        if (!vect.contains( (X + k) + "," + (Y + l) )) {
                            res = false;
                            break;
                        }
                    }
                    if (!res) break;
                }
                if (!res) {
                    break;
                } else {
                    cnt++;
                }
                map.put(j + "", map.getOrDefault(j + "", 0) + 1);
            }
        }
        System.out.println(map);
    }
}
