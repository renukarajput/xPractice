package common;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeIntegerTest {

    PalindromeInteger palindromeInteger = new PalindromeInteger();

    @Test
    public void isPalindrome_1() {
        assertTrue(palindromeInteger.isPalindrome(12321));
    }

    @Test
    public void isPalindrome_2() {
        assertFalse(palindromeInteger.isPalindrome(123));
    }

    @Test
    public void isPalindrome_3() {
        assertFalse(palindromeInteger.isPalindrome(-123));
    }

    @Test
    public void isPalindrome_4() {
        assertFalse(palindromeInteger.isPalindrome(0));
    }

    @Test
    public void isPalindrome_5() {
        assertFalse(palindromeInteger.isPalindrome(546));
    }

    @Test
    public void isPalindrome_6() {
        assertFalse(palindromeInteger.isPalindrome(5460));
    }

    @Test
    public void isPalindrome_7() {
        assertFalse(palindromeInteger.isPalindrome(1210));
    }
}