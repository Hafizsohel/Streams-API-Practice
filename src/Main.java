import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            int m,n,i,j, sum=0;
            Scanner input= new Scanner(System.in);
            System.out.println("1st No:");
            m=input.nextInt();

            System.out.println("Last No:");
            n=input.nextInt();

            for (i=m; i<=n; i++){
                for (j=2;  j<=i-1; j++){

                    if (i%j==0){
                        sum++;
                        break;

                    }
                }
                if (sum==0)
                    System.out.println(i);
                sum=0;
            }

        }
}
