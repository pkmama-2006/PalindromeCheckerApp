public class PalindromeCheckerApp {

    // ================= UC3 - Reverse String Method =================
    public static boolean reverseCheck(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
    public static boolean arrayCheck(String input) {

        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
    public static boolean stackCheck(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        for (char ch : input.toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }
    public static boolean queueStackCheck(String input) {

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop()))
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("     Version 1.0                 ");
        System.out.println("=================================");
        System.out.println("Application Started Successfully!");

        // ================= UC2 - Hardcoded Palindrome =================
        String word = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome (UC2)");
        else
            System.out.println(word + " is NOT a Palindrome (UC2)");

        // ================= UC3 - Reverse Method Call =================
        if (reverseCheck(word))
            System.out.println(word + " is a Palindrome (UC3 - Reverse)");
        else
            System.out.println(word + " is NOT a Palindrome (UC3 - Reverse)");
        // ================= UC4 - Character Array Method =================
        if (arrayCheck(word))
            System.out.println(word + " is a Palindrome (UC4 - Array)");
        else
            System.out.println(word + " is NOT a Palindrome (UC4 - Array)");
        // ================= UC5 - Stack Method =================
        if (stackCheck(word))
            System.out.println(word + " is a Palindrome (UC5 - Stack)");
        else
            System.out.println(word + " is NOT a Palindrome (UC5 - Stack)");
        // ================= UC6 - Stack Method =================
        if (queueStackCheck(word))
            System.out.println(word + " is a Palindrome (UC5 - Stack)");
        else
            System.out.println(word + " is NOT a Palindrome (UC5 - Stack)");
    }
}