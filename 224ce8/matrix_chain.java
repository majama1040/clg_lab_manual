
public class matrix_chain {

    public static void main(String[] args) {
        String a1 = "5*4";
        String a2 = "4*6";
        String a3 = "6*2";
        String a4 = "2*7";

        int p1 = a1.charAt(0) - '0';
        int p2 = a2.charAt(0) - '0';
        int p3 = a3.charAt(0) - '0';
        int p4 = a4.charAt(0) - '0';
        int p5 = a4.charAt(2) - '0';

        int[] p = {p1, p2, p3, p4, p5};

        System.out.println(p5);

        int[][] m = new int[5][5];
        int[][] s = new int[5][5];

        for (int q = 2; q < s.length; q++) {
            for (int i = 1; i < s.length-q+1; i++) {
                int j =i+q-1;

                if (i == j) {
                    m[i][j] = 0;
                    //System.out.println(i+" "+j);
                } else {

                    int k = i;
                    int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    int org_cost = cost;
                    for (int l = k+1; l <= j-1; l++) {
                        cost = Math.min(cost, m[i][l] + m[l + 1][j] + p[i - 1] * p[l] * p[j]);
                        System.out.println(i + ":i " + j + ":j " + ":k " + k + " " + cost);
                        if (org_cost != cost) {
                            k=l;
                        }
                    }
                    s[i][j] = k;
                    m[i][j] = cost;
                }
            }
        }


        int[][] m1 = new int[4][4];
        int[][] s1 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = m[i+1][j+1];
                s1[i][j] = s[i+1][j+1];
            }
        }



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(s1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
