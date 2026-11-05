class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while (i < n) {

            int j = i;

            // Find consecutive same characters
            while (j < n && s.charAt(i) == s.charAt(j)) {
                j++;
            }

            // Check group length
            if (j - i >= 3) {

                List<Integer> group = new ArrayList<>();

                group.add(i);
                group.add(j - 1);

                result.add(group);
            }

            // Move to next group
            i = j;
        }

        return result;
    }
}
        
   