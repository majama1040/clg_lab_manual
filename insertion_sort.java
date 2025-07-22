public class insertion_sort {
    public static void main(String[] args) {
        int[] num = {4,2,3,8,9}; 
        for (int i = 1; i < num.length; i++) {
              int key = num[i];
            int j = i-1;
           
            while (j >= 0 &&  num[j] > key) {
                
                num[j+1]= num[j];
                j--;
            }
           
                num[j+1]=key;
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
            

          