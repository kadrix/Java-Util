import java.util.Arrays;

class Solution {
    public static String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if(!isDigit1 && !isDigit2) {
                // compare the two words
                int cmp = split1[1].compareTo(split2[1]);
                if(cmp != 0) return cmp;
                // if the words are the same, use the identifier
                return split1[0].compareTo(split2[0]);
            }
            // words go first, so if first word isnt a digit, then itll go after
            // if first word is a digit then have to check if second word is digit
            // if second word is digit then the two should remain equal
            // else second word goes first
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }

    public static void main (String [] args){
        String[] str = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        reorderLogFiles(str);
        }
}