import java.util.Arrays;
class LargestGap {

    public static void main(String[ ] args) {
        int[] arr = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        System.out.println(largestGap(arr));
    }

    public static int largestGap(int[] num) {
        int largestGap = 0;
        Arrays.sort(num);

        for (int i = 1; i < num.length; i++) {
            int gap = num[i] - num[i-1];
            if (gap > largestGap)
                largestGap = gap;
        }

        return largestGap;
    }
}