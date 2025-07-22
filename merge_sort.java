
public class merge_sort {

   public static void mergesort(int a[], int lb, int ub)
    {
        int mid=0;
        if(lb<ub)
        {
            mid=(lb+ub)/2;
            mergesort(a,lb,mid);
            mergesort(a,mid+1,ub);
            merge(a,lb,mid,ub);
        }
    }
    public static void merge(int a[], int lb, int mid, int ub)
    {
        int b[] = new int[a.length];
        int i,j,k;
        i=lb;
        j=mid+1;
        k=lb;
        while(i<=mid && j<=ub)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid)
            {
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for(k=lb;k<=ub;k++)
            {
                a[k]=b[k];
            }
    }
    public static void main(String[] args) {
        int []n = {4,3,2,5,1};
        mergesort(n, 0, n.length-1);
        for (int a : n) {
            System.out.println(a);
        }
    }
}
