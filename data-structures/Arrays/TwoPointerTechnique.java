public class TwoPointer {

    static boolean findPair(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return true;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        boolean result = findPair(arr, target);

        if(!result) {
            System.out.println("No pair found");
        }
    }
}
