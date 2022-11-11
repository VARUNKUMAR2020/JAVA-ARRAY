public class Array {
    public static void main(String[] args) {
        System.out.println("Even place Number in the array: ");

        // array
        int number[] = { 23, 24, 54, 65, 100, 145, 654 };

        // to run the elements in the array
        for (int i = 1; i < number.length; i++) {

            //condition to check even place
            if (i % 2 == 0) {
                System.out.println(number[i]);
            }
        }
    }
}
