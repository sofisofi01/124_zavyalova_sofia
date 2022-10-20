import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for(Integer i : data) {
            if ((i%k==0) && (i%n !=0))
                newlist.add(i);
        }
        return newlist;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        ArrayList<Integer> newlist = new ArrayList<>();
        int m = 0;
        for (int i = 1; i <= size; i++){
            m = 0;
            if (newlist.size() < size)
                while (m < i && newlist.size() < size){
                    newlist.add(i);
                    m++;
                }
            else
                break;
        }

        return newlist;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> intersection = new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        return union;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> diff = new HashSet<>(s1);
        diff.addAll(s2);
        diff.removeAll(s1);
        return diff;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> diff2 = new HashSet<>();
        for(Integer i : s2) {
            if (!s1.contains(i))
                diff2.add(i);
        }
        for(Integer i : s1) {
            if (!s2.contains(i))
                diff2.add(i);
        }
        return diff2;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        return null;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        return null;
    }
}
