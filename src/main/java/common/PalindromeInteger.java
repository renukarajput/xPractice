package common;

public class PalindromeInteger {
    // 121 , 100
    public boolean isPalindrome(int no) {
        if (no <= 0 || (no % 10 == 0 && no != 0))
            return false;

        int revertedNumber = 0;
        while (no > revertedNumber){
            revertedNumber = revertedNumber * 10 + no % 10;
            no = no/10;
        }
        return no == revertedNumber || no == revertedNumber/10;
    }
}
