import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random random = new Random();
        int[] array = new int[5];
        HashMap<Integer,Integer> narray = new HashMap<>();
        Counter b = new Counter();
        for(int i = 0; i<array.length; i++){
            array[i] =  random.nextInt(10)+10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        narray = b.count(array);
        System.out.println(narray);
    }
}