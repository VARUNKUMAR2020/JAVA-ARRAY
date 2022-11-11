public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("To find Frequency in the Array");

        // Declaring the array
        int arr[] = { 2, 4, 2, 6, 6, 3, 7 };
        // another array of the same size
        int visitedArr[] = new int[arr.length];
        // initialization
        int visited = -1;

        // Keeping first element fix
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            // moving the other element to compare
            for (int j = i + 1; j < arr.length; j++) {
                // condition for checking
                if (arr[i] == arr[j]) {
                    count++;
                    visitedArr[j] = visited;
                }
            }
            // condition to check if not equal to -1
            if (visitedArr[i] != visited) {
                visitedArr[i] = count;
            }
        }
        
        // printing the visited array
        for (int i = 0; i < visitedArr.length; i++) {
            if (visitedArr[i] != visited) {
                System.out.println("Frequency of " + arr[i] + " : " + visitedArr[i]);
            }
        }
    }
}
