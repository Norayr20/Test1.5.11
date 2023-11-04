import java.util.Arrays;

public class AcceptsConnectsAndSorts {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};
        int[] mergedAndSorted = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(mergedAndSorted));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);

        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
