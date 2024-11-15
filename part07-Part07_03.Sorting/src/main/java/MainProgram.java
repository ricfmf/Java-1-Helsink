
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int small = array[0];
        int i;
        for (i = 1; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int small = array[0];
        int i, index = 0;
        
        for (i = 1; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int i, index = startIndex;
        
        for (i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                small = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int i, small;
        
        for (i = 0; i < array.length; i++) {
            small = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, small);
        }
    }
}
