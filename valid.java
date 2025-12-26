import java.util.Stack;

public class valid {

    static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/';
    }

    static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    static boolean isValid(String exp) {
        Stack<Character> st = new Stack<>();
        char prev = '\0';

        for (char ch : exp.toCharArray()) {

            if (isOperand(prev) && isOperand(ch)) return false;//ab
            if (prev == ')' && isOperand(ch)) return false;// )a
            if (isOperand(prev) && ch == '(') return false;// a(
            if (prev == ')' && ch == '(') return false;// )(
            if (isOperator(prev) && ch == ')') return false;// +)
            if (prev == '(' && ch == ')') return false;// ()

            if (ch != ')') {
                st.push(ch);
            } else {
                boolean hasOperator = false;
                while (!st.isEmpty() && st.peek() != '(') {
                    if (isOperator(st.peek())) hasOperator = true;
                    st.pop();
                }
                if (st.isEmpty()) return false;
                st.pop();
                if (!hasOperator) return false;
            }

            prev = ch;
        }

        return true;
    }

    static void main(String[] args) {
        System.out.println(isValid("(a+b*(c/d)e)"));
        System.out.println(isValid("(a+b*(c/d)*e)"));
        System.out.println(isValid("(a)"));
        System.out.println(isValid("a+b"));

    }
}
