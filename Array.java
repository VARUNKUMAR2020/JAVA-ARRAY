public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Second largest number in the array: ");

        // array
        int number[] = { 23, 214, 154, 65, 100, 145, 654 };

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                // condition for sorting the array
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        int second = number.length-2;//using sorted array,finding the second largest
        System.out.println(number[second]);
    }
}
