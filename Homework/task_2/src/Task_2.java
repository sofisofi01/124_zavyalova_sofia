public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        int b=0;
        int c=0;
        while (b<=num) {
            if (b*b<=num)
             c=b*b;
            else
                break;
            b++;
        }
        return c;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        return 0;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        return false;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        return 0;
    }
}
