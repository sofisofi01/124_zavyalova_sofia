public class Dubler {
    public int[] doubling(int[] array) {
        int[] newArray = new int[array.length * 2];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[j] = array[i];
            newArray[j + 1] = array[i];
            j = j + 2;
        }
        return newArray;
    }
}
