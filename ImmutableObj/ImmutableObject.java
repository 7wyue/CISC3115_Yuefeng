import java.util.Scanner;

public class ImmutableObject {


    //Part 1
    public static void main(String[] args) {
        double fahrenheit;
        double centigrade;
        fahrenheit = 98.6;

        centigrade = 5.0/9*(fahrenheit-32);
        System.out.println(centigrade);

        double centiVal=0.0;
        for(int i = 0;i<=10;i++){
            if(i!=10)
                System.out.print(centiVal+", ");
            else
                System.out.print(centiVal);
            centiVal += 4;
            
            

        }
        System.out.println();
        centiVal =0.0;
        while(centiVal<=40.0){

        if(!(Math.abs(centiVal-40.0)<0.00001))
                System.out.print(centiVal+", ");
            else
                System.out.print(centiVal);
            centiVal += 4;


        }
        System.out.println();


        //part 2
        String[][] myArray = {
            //Car
            {"BMW", "Ferrari", "Lambo"},
            //Food
            {"pizza", "burger", "dumpling"}
        };
        Scanner sc = new Scanner(System.in);
        String inputwords;
        boolean isin;
        System.out.println("Enter a word: ");
        inputwords = sc.next();
        while(sc.hasNextLine()){
        
        
        if(StopChecking(inputwords)){
            break;

        }
        for(int i =0; i<myArray.length;i++){

            for(int j =0; j<myArray[i].length;j++){
                isin=false;
                if(inputwords.equals(myArray[i][j]))
                    isin = true;
                    
 
                
                if(isin)
                    System.out.println("inputwords is in the 2D array");
                    
                System.out.println("inputwords is not in the 2D array");


                

            }

        }
        System.out.println("Enter a word: ");
        inputwords = sc.next();
        }


    }

    public static boolean StopChecking(String inputwords){

        if(inputwords.equals("STOP")){

            return true;
        }
        return false;
        

    }
}
