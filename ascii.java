import java.util.*;

public class ascii{
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isAlphabet(int ascii) {
        return (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122);
    }

    static char Alphabet(char ch) {
        int asc = ch;

        for (int d = 1; d <= 60; d++) {
            int left = asc - d;
            int right = asc + d;

            if (isAlphabet(left) && isPrime(left))
                return (char) left;

            if (isAlphabet(right) && isPrime(right))
                return (char) right;
        }

        return ch;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(Alphabet(ch));
    }
}
