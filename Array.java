public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Reverse order in the array: ");

        // array
        int number[] = { 23, 24, 54, 65, 100, 145, 654 };

        // to run the elements in the array
        for (int i=number.length-1;i>=0;i--) {
            System.out.print(number[i]+" ");
        }
        
    }
}
