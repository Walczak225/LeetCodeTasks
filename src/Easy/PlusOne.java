package Easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return new int[0];
        int[] a;
        if (digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        int[] array  = new int[digits.length + 1];
        array[0] = 1;
        return array;
    }
}
