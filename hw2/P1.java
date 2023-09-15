import java.util.Scanner;

public class P1{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int value= sc.nextInt();
        
        double smallest=sc.nextDouble();
        double readDouble;
        for(int i =0; i<value-1;i++){
            readDouble=sc.nextDouble();
            if(smallest>readDouble){
                smallest=readDouble;

            }

            
        }
    }
}