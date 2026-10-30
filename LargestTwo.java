public class LargestTwo {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 9, 7, 1 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        if (arr == null || arr.length < 2) {
            System.out.println("Not enough elements");
            return;
        }

    //     int largest = 0;
    //     int secondLargest = 0;
    //     boolean hasLargest = false;
    //     boolean hasSecond = fal
        // int[] arr = { 4, 7, 2, 9, 7, 1 };

    //     for (int num : arr) {
    //         if (!hasLargest || num > largest) {
    //             if (hasLargest) {
    //                 secondLargest = largest;
    //                 hasSecond = true;
    //             }

    //             largest = num;
    //             hasLargest = true;
    //         } else if (num < largest &&
    //                 (!hasSecond || num > secondLargest)) {
    //             secondLargest = num;
    //             hasSecond = true;
    //         }
    //     }

    //     if (hasSecond) {
    //         System.out.println("Largest = " + largest);
    //         System.out.println("Second largest = " + secondLargest);
    //     } else {
    //         System.out.println("No second-largest distinct value");
    //     }

    }
}
