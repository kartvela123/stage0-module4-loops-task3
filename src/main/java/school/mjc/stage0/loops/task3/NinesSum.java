package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int prev = 0;
            int newnum = 0;
            int ati = 1;
            for (int n = 1; n <= lengthOfLastNumber; n ++) {
                newnum += 9 * ati + prev;
                prev += 9 * ati;
                ati *= 10;

            }
            System.out.println(newnum);

        }
    }
}
