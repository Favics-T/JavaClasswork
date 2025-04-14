public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World"; // You can change this string
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // swap characters at left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // move the pointers toward each other
            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println("Reversed string: " + reversed);
    }
}
