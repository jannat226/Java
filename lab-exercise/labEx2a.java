public class labEx2a {
    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        // String charAt()
        System.out.println("First character: " + text.charAt(0));

        // String compareTo()
        String anotherString = "Another string";
        System.out.println("Comparison result: " + text.compareTo(anotherString));

        // String concat()
        System.out.println("Concatenated string: " + text.concat(" This is additional text."));

        // String contains()
        System.out.println("Contains 'workers': " + text.contains("workers"));

        // String endsWith()
        System.out.println("Ends with dot: " + text.endsWith("."));

        // String equals()
        System.out.println("Strings are equal: " + text.equals(anotherString));

        // String equalsIgnoreCase()
        System.out.println("Strings are equal ignoring case: " + text.equalsIgnoreCase(anotherString));

        // String format()
        System.out.println(String.format("Formatted Text: %s", text));

        // String getBytes()
        System.out.println("String as bytes: " + text.getBytes());

        // String getChars()
        char[] charArray = new char[text.length()];
        text.getChars(0, text.length(), charArray, 0);
        System.out.println("String as char array: " + new String(charArray));

        // String indexOf()
        System.out.println("Index of 'rain': " + text.indexOf("rain"));

        // String intern()
        System.out.println("Interned String: " + text.intern());

        // String isEmpty()
        System.out.println("Is the string empty? " + text.isEmpty());

        // String join()
        String[] words = text.split("\\s+");
        String joinedString = String.join("-", words);
        System.out.println("Joined String: " + joinedString);

        // String lastIndexOf()
        System.out.println("Last Index of 'villages': " + text.lastIndexOf("villages"));

        // String length()
        System.out.println("Length of the string: " + text.length());

        // String replace()
        String replacedText = text.replace("Bombay", "Mumbai");
        System.out.println("After replace: " + replacedText);

        // String replaceAll()
        String regexReplacedText = text.replaceAll("\\b(\\w{4})\\b", "****");
        System.out.println("After regex replaceAll: " + regexReplacedText);

        // String split()
        String[] splitWords = text.split("\\s+");
        System.out.println("Split words: " + String.join(", ", splitWords));

        // String startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("Does the string start with 'We'? " + startsWithWe);

        // String substring()
        String substringExample = text.substring(20, 40);
        System.out.println("Substring (20 to 40): " + substringExample);

        // String toCharArray()
        System.out.println("String as char array: " + text.toCharArray());

        // String toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase());

        // String toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase());

        // String trim()
        System.out.println("Trimmed text: " + text.trim());

        // String valueOf()
        int value = 42;
        String stringValue = String.valueOf(value);
        System.out.println("String value of 42: " + stringValue);

    }

}
