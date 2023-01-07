
import java.util.ArrayList;
public class TimeController {
    public String getActionWithMaxTime(ArrayList<String> action, ArrayList<Integer> time) {
        int maxTime = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i<time.size(); i++) {
            if (maxTime < time.get(i)) {
                maxTime = time.get(i);
                num = i;
            }

        }

        return action.get(num);
    }
}
