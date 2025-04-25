public class LargestSmallest {
    public static void main(String[] args) {

        
        int[] numbers = {25, 12, 45, 67, 3, 89, 1};

        
        int largest = numbers[0];
        int smallest = numbers[0];

        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; 
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i]; 
            }
        }

        
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nThe largest element is: " + largest);
        System.out.println("The smallest element is: " + smallest);
    }
}
