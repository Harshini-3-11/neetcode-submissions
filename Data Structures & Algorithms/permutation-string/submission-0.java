class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            int[] temp = new int[26];

            for (int j = i; j < i + s1.length(); j++) {
                temp[s2.charAt(j) - 'a']++;
            }

            boolean same = true;

            for (int j = 0; j < 26; j++) {
                if (count[j] != temp[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}