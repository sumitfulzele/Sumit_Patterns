public class floydTriangle {
    public static void main(String[] args) {
        
        int ref = 1;
        int number = 5;

        for(int i = 1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ref+" ");
                ref++;
            }
            System.out.println();
        }
    }
    
}
