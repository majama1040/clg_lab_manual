
import java.util.Arrays;

public class knapsack_prob {

    public static void main(String[] args) {
        int w = 15;
        int[] pi = {10, 5, 15, 7, 6, 18, 3};
        int[] wi = {1, 3, 5, 7, 1, 4, 1};
        float[][] obj = {{10, 1}, {5, 3}, {15, 5}, {7, 7}, {6, 1}, {18, 4}, {3, 1}};
        float[] nums = new float[obj.length];


        for (int i = 0; i < obj.length; i++) {
            float temp = (obj[i][0] / obj[i][1]);
            System.err.print(temp+" ");
            nums[i] = temp;
        }
        /*for (float i : nums) {
            System.out.println(i);
        }*/
        Arrays.sort(nums);
        for (float i : nums) {
            System.out.println(i);
        }
        float[] so = new float[obj.length];
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length; j++) {

                if (nums[i] == obj[j][0] / obj[j][1]) {
                    so[i] = obj[j][0];
                    break;
                }
            }
        }
        System.out.println("array");
        for (float i : so) {
            System.out.println(i);
        }

    }

}
