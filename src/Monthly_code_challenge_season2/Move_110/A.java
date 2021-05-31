package Monthly_code_challenge_season2.Move_110;

public class A {

    public String[] solution(String[] s) {
        String[] answer = {};

        /*
        *
        * 0 이 최대한 앞으로
        *
        * 마지막 0 뒤에
        * 0이 없다면 가장 앞에 있는 1 앞에
        *
        * */

        for (int i = 0; i < s.length; i++) {
            char[] s_arr = s[i].toCharArray();
            char[] bucket = new char[s_arr.length];

            for (int j = 0; j < s_arr.length; j++) {
                bucket[j] = s_arr[j];

                if (j >= 2 && bucket[j - 2] == 1 && bucket[j - 1] == 1 && bucket[j] == 0) {

                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        A A = new A();
        String[] s = {"1110", "100111100", "0111111010"};

        for (String s1 : A.solution(s)) {
            System.out.println(s1);
        }
    }
}
