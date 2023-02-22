package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min;
        int max = 0;
        if (first < second) {
            min = first;
        }else {
            min = second;
        }
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            for (int num = 1; num <= min; num ++) {
                if ((second % num == 0) && (first % num == 0)) {
                    if (num > max) {
                        max = num;
                    }

                }

            }
         System.out.println(max);
    }
}
    }
