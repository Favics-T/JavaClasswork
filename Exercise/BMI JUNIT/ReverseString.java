public class ReverseString {
    public static void main (String []args){
        char[] charArray = str.toCharArray();
        int left =0;
        int right =str.length() -1;

        while(left < right){
            //swap characters at the left and rigth positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            //move the pointers towards each other
            left++;
            right++;
        }
        return new String(charArray);
    }
}
