import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        for(int i = 0; i < N ; i++){
            list[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(list);

        System.out.printf("%d %d", list[0], list[N-1]);
    }

}
