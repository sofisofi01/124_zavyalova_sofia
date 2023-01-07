import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random random = new Random();
        int[] array = new int[5];
        int[] narray = new int[10];
        Dubler d = new Dubler();
        for (int i = 0; i<array.length; i++){
            array[i] =  random.nextInt(100)-100;
            System.out.print(array[i]);
        }

        System.out.println();

        narray = d.doubling(array);

        for (int i = 0; i<narray.length;i++){
            System.out.print(narray[i]);
        }
    }
}