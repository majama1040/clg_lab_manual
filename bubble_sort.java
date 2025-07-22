public class bubble_sort {

    public static void main(String[] args) {
        int[] num = {2,1,3,5,4};
        int n = 5;
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < num.length-1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}