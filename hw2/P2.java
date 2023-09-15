import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int count =0;
        int read=sc.nextInt();
        while(sc.hasNextInt()){
            read=sc.nextInt();
            if(read==0){
                System.out.print(count+ " ");
                count=0;
            }else if(read<0){
                count++;

            }
           
        }

    }
}
