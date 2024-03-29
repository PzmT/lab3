import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static int[] getBubbleSort(int[] input) {
        int[] result = input.clone(); // 创建一个输入数组的副本
        int l = result.length;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - i; j++) {
                if (result[j] < result[j - 1]) {
                    int temp = result[j - 1];
                    result[j - 1] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
