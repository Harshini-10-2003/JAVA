public class Maxi {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 2, 3, 5, 6, 6, 2, 2, 3, 1, 2 };
        int visit[] = new int[arr.length];
        for (int i = 0; i < visit.length; i++) {
            visit[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            visit[arr[i]] += 1;
        }
        int max = visit[0];
        for (int i = 0; i < visit.length; i++) {

            if (max < visit[i]) {
                max = visit[i];
            }

        }
        System.out.println(max);

    }

}
