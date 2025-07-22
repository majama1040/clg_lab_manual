import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int num1[] = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int low = 0;
        int high = num1.length-1;
        int flag = 0;
        while (low<=high) {
            int mid = (low+high)/2;
            if (num2>num1[mid]) {
                low=mid+1;
            }
            else if(num2<num1[mid]){
                high=mid-1;
            }
            else if (num2 == num1[mid]) {
                System.out.println("The number found at index : "+ mid);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Number not found");
        }
    }
}
