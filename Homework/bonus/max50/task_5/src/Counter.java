import java.util.HashMap;
public class Counter {
    public HashMap <Integer, Integer> count(int[] array) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (num.containsKey(array[i])) {
                int sum = num.get(array[i])+1;
                num.put(array[i],sum);
            }
            else {
                num.put(array[i],1);
            }
        }
        return num;
    }
}
