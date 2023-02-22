package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char first = 'a';
        char last = 'z';

        for (int num  = first; num <= last; num++) {
            char result = (char) num;
            System.out.println(result);

        }
    }
}
