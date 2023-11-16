class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 1 };
        int target = 6;
        // sortArray(arr);

        // int pos = binarySearch(arr, 2, 0, arr.length);

        // System.out.println(pos);

        int[] res = twoSum(nums, target);
        System.err.println("result: " + res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int searchEle = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == searchEle) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    static int binarySearch(int[] arr, int low, int high, int searchEle) {

        int mid = (low + high) / 2;

        if (arr[mid] == searchEle)
            return mid;

        if (searchEle > arr[mid])
            return binarySearch(arr, mid + 1, high, searchEle);

        if (searchEle < arr[mid])
            return binarySearch(arr, low, mid - 1, searchEle);

        return -1;
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        System.out.println("-----arr----------");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("---------------");
    }
}