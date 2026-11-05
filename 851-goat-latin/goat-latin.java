
class Solution {

    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        StringBuilder a = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            char first = Character.toLowerCase(word.charAt(0));

            // Check vowel
            if (first == 'a' || first == 'e' ||
                first == 'i' || first == 'o' ||
                first == 'u') {

                word = word + "ma";

            } else {

                // Move first character to the end
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            // Add one 'a' for each word
            a.append("a");

            word = word + a;

            if (i > 0) {
                result.append(" ");
            }

            result.append(word);
        }

        return result.toString();
    }
}
