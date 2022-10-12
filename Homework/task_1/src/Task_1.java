public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        if (first < second && first < third)
            return first;
        else if (second < first && second < third)
            return second;
        else
            return third;
    }
    @Override
    public boolean subtask_2_if(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false; 
    }
    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {
        if ((height == width) && (height > 0))
            if (((left_up_x + width)-x <= 0.000001 || x - left_up_x <= 0.000001) || (left_up_y - y <= 0.000001 || y - (left_up_y - height) <= 0.000001))
                return 0;
            else
                if (x > left_up_x && x < (left_up_x + width) && y < left_up_y && y > (left_up_y - height))
                    return 1;
                else
                    return 0;
        else
            return 2;
    }
    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {

        if (Math.abs(y0 - (k*x0 + b)) <= 0.000001)
            return 2;
        else
            if (y0 < k*x0 + b)
                return 1;
            else
                 return 0; 
    }
    @Override
    public String subtask_5_switch(int day_od_week) {
        String weekdays = switch(day_od_week) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
        return weekdays;
    }
    @Override
    public String subtask_6_switch(int direction) {
               String Dir = switch(direction) {
            case 1 -> "север";
            case 2 -> "юг";
            case 3 -> "запад";
            case 4 -> "восток";
            default -> "";
        };
        return Dir;
    }
    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        double length = Math.sqrt(wall*wall*Math.abs(vx) + wall*wall*Math.abs(vy) + wall*wall*Math.abs(vz));
        double time1 = length/speed;
        if((time > 0) && (speed > 0))
            if ((Math.abs(time1 - time) <= 0.000001) || ((time1 <= time))&& vx != 0)
                return 1;
            else
                return 0;
        else
            return 2;
    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
         if ((Math.abs(k1 - k2) <= 0.000001))
             if ((Math.abs(b1 - b2) <= 0.000001))
            return 3;
        else
                return 1;
            else
                 return 2;
    }
}
