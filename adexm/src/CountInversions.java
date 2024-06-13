public class CountInversions {
    static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int inversions = 0;
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // Inversion found
                inversions += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, left, arr, left, right - left + 1);
        return inversions;
    }

    static int countInversions(int[] arr, int[] temp, int left, int right) {
        int inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            inversions += countInversions(arr, temp, left, mid);
            inversions += countInversions(arr, temp, mid + 1, right);
            inversions += mergeAndCount(arr, temp, left, mid, right);
        }
        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1}; // Example array
        int[] temp = new int[arr.length];
        int inversions = countInversions(arr, temp, 0, arr.length - 1);

        System.out.println("Number of inversions: " + inversions);
    }
}
