public class NeedleHaystack {

    public static int findNeedle(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) {
            return 0;
        }
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = findNeedle(haystack, needle);
        System.out.println("Index of the first occurrence of the needle in the haystack: " + index);
    }
}
