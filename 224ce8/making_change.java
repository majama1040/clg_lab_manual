class making_change{
    public static void main(String[] args) {
        int[] coin = {1,2,6,9};
        int n = 10;
        int len_c = coin.length;
        
        int[][] a = new int[len_c][n+1];

        for (int i = 0; i < len_c; i++) {
            a[i][0] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < n+1; j++) {
                if (coin[i]==1) {
                    a[i][j]=j;
                }
                else if(coin[i]>j){
                    a[i][j]=a[i-1][j];
                }
                else{
                    a[i][j]=Math.min(a[i-1][j], 1+a[i][j-coin[i]]);
                }
            }
        }

        System.out.println(a[len_c-1][n]);

        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int i = len_c-1;
        int j = n;
        System.out.print("Coins required are : ");
        while (j>0) {
            if (a[i][j] == a[i-1][j]) {
                i = i-1;
            }
            else{
                j=j-coin[i];
                System.out.print(coin[i]+" ");
            }

            if(i==0){
                j = j-coin[i];
                System.out.print(coin[i]+" ");
            }
        }
    }
}