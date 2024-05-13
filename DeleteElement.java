package Question6;

public class DeleteElement{
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2; // Index of the element to delete

        // Call the deleteElement method
        int[] modifiedArray = deleteElement(array, indexToDelete);

        // Print the modified array
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        // Check if the index is valid
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array; // Return the original array unchanged
        }

        // Create a new array with size one less than the original array
        int[] newArray = new int[array.length - 1];
        // Copy elements from the original array to the new array, skipping the element at the specified index
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        return newArray; // Return the modified array
    }
}

