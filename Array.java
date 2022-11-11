public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Largest Number in the array: ");

        // array
        int number[] = { 23, 24, 54, 65, 100, 145, 654 };

        // assign
        int max = number[0];

        // to run the elements in the array
        for (int i = 0; i < number.length; i++) {
            if (number[i] < max) {
                max = number[i];
            }
        }
        System.out.println("Largest number is: " + max);
    }
}
