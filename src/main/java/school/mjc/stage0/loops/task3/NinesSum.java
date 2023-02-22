package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int prev = 0;
            int newnum = 9;
            for (int n = 1; n <= lengthOfLastNumber; n *= 10) {
                newnum += 9 * n + prev;
                prev = newnum;

            }
            System.out.println(newnum);

        }
    }
}
