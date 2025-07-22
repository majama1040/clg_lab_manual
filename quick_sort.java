public class quick_sort {
    static int[] num1 = {4,3,2,5,1};
    public static void quick(int[] num1, int lb, int ub){
        if(lb<ub){
            int l = partision(num1,lb,ub);
            quick(num1, lb, l-1);
            quick(num1, l+1, ub);
        }
    }
    public static int partision(int[] num1, int lb, int ub){
        int pivot = num1[ub];
        int i = lb;
        int j = ub;
        while(i<=j){
            while (num1[i]<=pivot) {
                i++;
            }
            while (num1[j]>pivot) {
                j--;
            }
            if (i<j) {
                int temp = num1[i];
                num1[i] = num1[j];
                num1[j] = temp;
            }
        }
        int temp = num1[j];
        num1[j] = num1[i];
        num1[i] = temp;
        return j;
    }
    public static void main(String[] args) {
        
        quick(num1, 0, num1.length-1);
        for (int a : num1) {
            System.out.println(a);
        }
    }
}
