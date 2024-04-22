package StringPolindromTask;
import java.lang.String;
public class PolindromTask {
    public static void main(String[] args) {
        String str = "elimmmveli";
        String s = "babad";
        System.out.println(findLongestPalindrome(str));
        //System.out.println(isPalindrome(str));
//        char[] charArray = str.toCharArray();
//        System.out.println(getReverseString2(charArray));


    }



//    public  static String getReverseString1(String s) {
//
//        String reversedStr = "";
//        for(int i=s.length(); i>0; i--) {
//
//            reversedStr += s.charAt(i-1);       ///string concatenation '+=' in loop    Problemi var
//        }
//
//        return reversedStr;
//    }
//
//    public  static char[] getReverseString2(char[] s) {
//
//        int length = s.length;
//        for (int i = 0; i < s.length / 2; i++) {
//            char temp = s[length - i - 1];
//            s[length - i - 1] = s[i];
//            s[i] = temp;
//        }
//        return s;
//    }










//    public static boolean isPalindrome(String str) {
////        int i = 0, j = str.length() - 1;
//
//        for(int i = 0, j = str.length() - 1;i < j;i++,j--)
//        {
//            if(str.charAt(i) != str.charAt(j))
//            {
//                return false;
//            }
//
//        }
//        return true;
//    }











        public static String findLongestPalindrome(String s) {

            int start = 0;
            int maxLength = 1;

            for (int i = 0; i < s.length(); i++) {
                int low = i - 1;
                int high = i + 1;

                while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                    if (high - low + 1 > maxLength) {
                        start = low;
                        maxLength = high - low + 1;
                    }
                    low--;
                    high++;
                }

                low = i;
                high = i + 1;
                while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                    if (high - low + 1 > maxLength) {
                        start = low;
                        maxLength = high - low + 1;
                    }
                    low--;
                    high++;
                }
            }

            return s.substring(start, start + maxLength);
        }



    }





