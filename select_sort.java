public class select_sort {
    public static void main(String[] args) {
        int[] num = {2,1,3,5,4};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length-1; j++) {
                if (num[j] < num[i]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}
