
public class lcs {

    public static void main(String[] args) {
        String x = "abaaba";
        String y = "babbab";
        int[][] num1 = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i < num1.length; i++) {
            num1[0][i] = 0;
            num1[i][0] = 0;
        }
        for (int i = 1; i < num1.length; i++) {
            for (int j = 1; j < num1.length; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1) && i > 0 && j > 0) {
                    num1[i][j] = num1[i - 1][j - 1] + 1;
                } else if (x.charAt(i - 1) != y.charAt(j - 1)) {
                    num1[i][j] = Math.max(num1[i][j - 1], num1[i - 1][j]);
                }
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(num1.length);

        int [] num2 = new int[4];
        int num3 = num2.length-1;
        int i = num1.length-1;
        int j = num1.length-1;
        //System.out.println("ini"+num1[i][j]);
        //System.out.println(y.charAt(i-1));
        while (i > 0 && j > 0) {
            if (x.charAt(i-1) == y.charAt(j-1) && i >= 0 && j >= 0) {
                //System.out.print(x.charAt(j)+"  j: "+j+ " ");
                i = i-1;
                j = j-1;
                //System.out.println("j :"+ j+ " "+ x.charAt(j));
                num2[num3]= j;
                num3--;
            } else if (x.charAt(i - 1) != y.charAt(j - 1)) {
                i = i;
                j = j-1;
            }
            if (i == 0 || j==0) {
                //System.out.println(y.charAt(j));
                num2[num3]= j;
                num3--;
            }
            
        }
        for (int j2 = 0; j2 < num2.length; j2++) {
            System.out.print(x.charAt(num2[j2]));
        }
    }
}
