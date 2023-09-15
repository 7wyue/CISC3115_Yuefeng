public class Method {
    public static void main(String[] args) {
        


    }
    
    public static int m1(int[] arr){
        int sum=0;    
        for(int i=0;i<arr.length;i++){
                if(arr[i]>arr.length-1&&arr[i]%9==0){
                    sum=sum+arr[i];

                }


            }
            
            return sum;
    }
    public static int m2(double[] arr){
        int index=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[index]){
                index=i;

            }

        }
        return index;


    }
    public static int m3(double[] arr,double x){
        int count=0;
        for(double n :arr){
            //cou
            if(Math.abs(n-x)<0.00001){
                count++;
            }
            
        }

        return count;
    }
    
}
