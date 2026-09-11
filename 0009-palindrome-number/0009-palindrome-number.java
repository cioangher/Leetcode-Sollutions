class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copy = x;
        int flipped = 0;

        while (copy > 0){
            flipped = flipped * 10 + copy % 10;
            copy /= 10;
        }
        if (x == flipped){
            return true;
        } else {
            return false;
        }

    }
}