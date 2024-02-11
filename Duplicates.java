public class Duplicates {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 2, 2, 3, 2, 4, 2, 4, 5 };
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < arr.length; i++) {
            visited[arr[i]] = true;
        }
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == true) {
                System.out.println(i);
            }

        }
    }
}
