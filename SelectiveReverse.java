class SelectiveReverse {
    public static void main(String[ ] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] newArr = selectiveReverse(arr, 3);

        for (int val : newArr) {
            System.out.print(val + ", ");
        }

    }

    public static int[] selectiveReverse(int[] arr, int index) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i += index) {
            int k = i;
            for (int j = i+index-1; j >= i; j--) {
                if (j < arr.length) {
                    newArr[k] = arr[j];
                    k++;
                }

            }
        }
        return newArr;
    }
}