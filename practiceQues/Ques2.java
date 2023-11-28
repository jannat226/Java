package practiceQues;

public class Ques2 {
    public static void main(String[] args) {
        String sentence = "Betty bought some butter";
        String[] words = sentence.split(" ");
        int length = words.length;

        for (int i = 0; i < length; i++) {
            System.out.println(words[i]);
        }
    }
}
