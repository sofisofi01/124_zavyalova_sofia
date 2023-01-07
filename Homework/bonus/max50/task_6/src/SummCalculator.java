import java.util.HashMap;
import java.util.Map;
public class SummCalculator {
    public int calculateSumm (HashMap<String, Integer> quantity, HashMap<String, Integer> price) {
        int sum = 0;

        for (Map.Entry entry : quantity.entrySet()) {
            if (price.containsKey(entry.getKey())) {
                sum = sum + quantity.get(entry.getKey()) * price.get(entry.getKey());
            }
        }
        return sum;
    }
}