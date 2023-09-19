import java.util.Scanner;

class ImmutableObject {


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



        //
        //
        //part 2
       
        Scanner sc = new Scanner(System.in);
        String inputwords;
        

        while(true){
            System.out.println("Enter a word: ");
            inputwords = sc.next();
        
            if(StopChecking(inputwords)){
                sc.close();
                break;

            }else
                checkWordInArray(inputwords);
            


        }


    }

    public static boolean StopChecking(String inputwords){

        return inputwords.equals("STOP");

   

    }

    public static void checkWordInArray(String inputwords){
        
         String[][] myArray = {
            //Car
            {"BMW", "Ferrari", "Lambo"},
            //Food
            {"pizza", "burger", "dumpling"}
        };
        boolean isin=false;
            for(int i =0; i<myArray.length;i++){

                for(int j =0; j<myArray[i].length;j++){
                    isin=inputwords.equals(myArray[i][j]);
                    if(isin){
                    System.out.println("inputwords is in the 2D array");
                    return;}

                }

            }
            if(!isin)
                System.out.println("inputwords is not in the 2D array");

    }
}
