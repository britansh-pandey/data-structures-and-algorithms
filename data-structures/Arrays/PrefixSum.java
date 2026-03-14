public class PrefixSum {

    static int[] buildPrefix(int arr[]) {

        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    static int rangeSum(int prefix[], int left, int right) {

        if(left == 0)
            return prefix[right];

        return prefix[right] - prefix[left-1];
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        int prefix[] = buildPrefix(arr);

        int result = rangeSum(prefix,1,3);

        System.out.println(result);
    }
}
