import java.util.Scanner;
public class linera_search {
    public static void main(String[] args) {
        int[] num1 = {1,4,2,6,8,9};
        int flag=0;
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num2) {
                System.out.println("Number found at index "+i);
                flag=1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Number not found");
        }
    }
}
