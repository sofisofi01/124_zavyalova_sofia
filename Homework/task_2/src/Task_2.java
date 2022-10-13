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
        int p = 1;
        if (num == 0)
            p=1;
        else
            while (num != 0){
                p= 2*p + 6;
                num--;
            }
        return p;

    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        int k=base;
        while (k<num)
            k=k*base;
        return k == num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        int k=0;
        while (start > end){
            if ((start%2 != 0) || (start-end == 2)){
                start--;
                k++;
            }
            else {
                start=start/2;
                k++;
            }
        }
        return k;
    }
}
