package Question4;
import java.util.Arrays;
public class BubbleSort {
    static void bubble(String[] array){
        int lenArr = array.length;
        for (int i = lenArr -1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]){
                    char temp = array[j];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] data = {"E", "C", "A", "B", "D"};
        bubble(data);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(data));
    }
}
