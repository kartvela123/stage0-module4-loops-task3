package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int newnum = 1;
        int prev = 0;
        int res = 0;
        System.out.println(prev);
        System.out.println(newnum);
        for (int num = 2; num < lastFibonacci; num++) {
            System.out.println(newnum + prev);
            res = newnum + prev;
            prev = newnum;
            newnum = res;
        }
    }
}
