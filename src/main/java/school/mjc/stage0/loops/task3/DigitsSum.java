package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int b = 0;
        int n;
        String a = "" + t;
        if (t> 0) {
            n = 0;
        }else {
            n = 1;
        }
        System.out.println(a);
        System.out.println(a.length());
        for (int num = n; num <= a.length() - 1; num ++) {
            b += Character.getNumericValue(a.charAt(num));

        }
        System.out.println(b);
    }
}

