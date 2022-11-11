public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Largest Number in the array: ");

        // array
        int number[] = { 23, 24, 100, 65, 24, 54, 65, 100, 145, 654 };
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if ((number[i] == number[j])) {
                    System.out.println("Duplicate Elements are: " + number[j]);
                }
            }
        }

    }
}
