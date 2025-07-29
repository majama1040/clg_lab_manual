public class fact_iter {
    public static void main(String[] args) {
        int num1 = 5,fact=1;
        for( int i = num1; i>0;i--){
            fact=fact*i;
        }        
        System.out.println(fact);
    }
}
