import java.util.Arrays;

public class IntervalMergerTest {
    public static void main(String[] args) {
        int[][] in1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] out1 = IntervalMerger.merge(in1);
        int[][] exp1 = {{1, 6}, {8, 10}, {15, 18}};
        assert Arrays.deepEquals(out1, exp1) : "Test 1 failed";

        int[][] in2 = {{1, 4}, {4, 5}};
        int[][] out2 = IntervalMerger.merge(in2);
        int[][] exp2 = {{1, 5}};
        assert Arrays.deepEquals(out2, exp2) : "Test 2 failed";

        System.out.println("All IntervalMerger tests passed!");
    }
}
