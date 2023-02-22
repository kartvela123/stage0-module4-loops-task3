package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int newnum = 1;
        int prev = 0;
        System.out.println(prev);
        System.out.println(newnum);
        for (int num = 3; num < lastFibonacci; num++) {
            System.out.println(newnum + prev);
            prev = newnum;
            newnum = newnum + prev;
        }
    }
}
