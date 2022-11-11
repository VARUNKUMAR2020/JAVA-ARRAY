public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Sorting in ascending of the array: ");

        // array
        int number[] = { 23, 214, 154, 65, 100, 145, 654 };

        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                //condition for greater or smaller
                if(number[i]>number[j]){
                    int temp=number[i];//when i greater assign to temp
                    number[i]=number[j];//j will assign to i
                    number[j]=temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: "); 
        for (int i = 0; i < number.length; i++)  
        { 
            System.out.print(number[i] + " "); 
        } 

    }
}
