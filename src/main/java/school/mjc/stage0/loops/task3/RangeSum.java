package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int number = firstBoarder; number <= secondBoarder; number++) {
            sum += number;

        }
        System.out.println(sum);
    }
}
