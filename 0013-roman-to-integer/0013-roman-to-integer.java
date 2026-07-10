class Solution {
    public int romanToInt(String s) {
            int sum = 0;
         for (int i = 0; i < s.length(); i++) {

            // Get current Roman numeral value
            int current = getValue(s.charAt(i));

            // If current is smaller than next, subtract it
            if (i < s.length() - 1 && current < getValue(s.charAt(i + 1))) {
                sum -= current;
            }
            // Otherwise add it
            else {
                sum += current;
            }
        }

        return sum;
    }
    public int getValue(char ch) {

        switch (ch) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }
    }
}