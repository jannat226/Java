public class Str1 {
    public static void main(String args[]) {
        String s1 = "Jannat";
        char ch[] = { 'j', 'a', 'n', 'n', 'a', 't' };
        String s2 = new String(ch);
        String s4 = "jannat";
        String s3 = new String("chehal");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // String Comparison:
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1 + s3);
        System.out.println(s1.concat(s3));

    }
}