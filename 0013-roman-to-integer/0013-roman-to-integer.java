class Solution {
    static Map<Character, Integer> roman = new HashMap<>();

    static {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));

            if (i < s.length() - 1 && current < roman.get(s.charAt(i + 1))) {
                total =total - current;
            } else {
                total = total + current;
            }
        }
        return total;
    }
}