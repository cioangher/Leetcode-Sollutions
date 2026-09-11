class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        char[] merged = new char[length1 + length2];

        int i = 0, j = 0;
        while (i < length1 && j < length2) {
            merged[i + j] = char1[i];
            i++;
            merged[i + j] = char2[j];
            j++;
        }
        while (i < length1) {
            merged[i + j] = char1[i];
            i++;
        }
        while (j < length2) {
            merged[i + j] = char2[j];
            j++;
        }

        return new String(merged);
    }
}   