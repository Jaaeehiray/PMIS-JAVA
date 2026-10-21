import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {

            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            String[] localParts = local.split("\\+");

            String name = localParts[0];

            name = name.replace(".", "");

            String finalEmail = name + "@" + domain;

            uniqueEmails.add(finalEmail);
        }

        return uniqueEmails.size();
    }
}

        
