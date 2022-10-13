public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        int k=0;
        if (n1<n2)
            for (;n1 <= n2; n1++){
                if ((n1%a == 0) && (n1%b != 0))
                    k++;
            }
        else
            for (;n2 <= n1; n2++) {
                if ((n2 % a == 0) && (n2 % b != 0))
                    k++;
            }
        return k;
    }

    @Override
    public int subtask_2_for(int num) {
        int k = 0;
        int m = 1;
        for (int i = 0; i <= num; i++) {
            k++;
            for (int j = 0; j < m; j++)
                i++;
            m++;
    }
        return k;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        int a = num;
        int s = 0;
        for (int i = 0; i < cnt; i++){
            s = s + a;
            a = a*d + 1;
        }
        return s;
    }

    @Override
    public int subtask_4_for(int n) {
        int k = 1;
        int s = 0;
        for(int i = 1; i <= n; i++) {
            k = k * i;
            s = s + k;
        }
        return s;
    }
}
