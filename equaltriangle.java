public class equaltriangle {

    public static void main(String[] args) {
        
        int number = 4;

        for(int i=1; i<=number; i++){

            for(int j=1; j<=number-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
