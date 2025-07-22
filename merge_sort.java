public class merge_sort {
    
    public static void merge_data(int[] num1, int lb, int mid, int ub){
        int i = lb,j = mid+1,k=lb;
        int num2[]=new int[5];
        while (i <= mid & j <=ub) {
            if (num1[i]<= num1[j]) {
                num2[k]=num1[i];
                i++;
            }
            else{
                num2[k]= num1[j];
                j++;
            }     
            k++;
        }
        if(i>mid){
            while(j<=ub){
                num2[k]=num1[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                num2[k]=num1[i];
                i++;
                k++;
            }
        }
        for(int num3 = 0; i< num2.length; i++){
            num1[num3] = num2[num3];
        }
    }
    
    public static void merge(int[] num1,int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            merge(num1,lb,mid);
            merge(num1,mid+1,ub);
            merge_data(num1,lb,mid,ub);
        }
    }
    public static void main(String[] args) {
        int[] num = {4,2,3,8,9}; 
        merge(num, 0, 4);
        for (int i : num) {
            System.out.println(i);
        }
    }
}
