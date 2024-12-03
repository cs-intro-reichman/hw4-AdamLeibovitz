public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the keywords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (contains(lowerCase(sentences[i]),lowerCase(keywords[j]))) {
                    System.out.println(sentences[i]);
                }
            }
        }
    }

    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    public static boolean contains(String str1, String str2) {
        boolean valid = false;
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(j) == str2.charAt(0) && j+str2.length() <= str1.length()) {
                valid = true;
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) != str1.charAt(j+i)) {
                        valid = false;
                        break;
                    }
                }
                if (valid == true) {
                    return true;
                }
            }  
        }
        return valid;
    }
}
