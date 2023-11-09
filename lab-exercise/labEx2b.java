public class labEx2b {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // append()

        System.out.println("1. Append: " + stringBuffer.append("world!"));

        // insert()

        System.out.println("2. Insert: " + stringBuffer.insert(7, "Java "));

        // replace()
        System.out.println("3. Replace: " + stringBuffer.replace(7, 11, "C++"));

        // delete()
        System.out.println("4. Delete: " + stringBuffer.delete(7, 11));

        // charAt()
        System.out.println("5. Char at index 2: " + stringBuffer.charAt(2));

        // setCharAt()
        stringBuffer.setCharAt(2, 'L');
        System.out.println("6. Set char at index 2: " + stringBuffer);

        // length()
        System.out.println("7. Length: " + stringBuffer.length());

        // capacity()
        System.out.println("8. Capacity: " + stringBuffer.capacity());

        // ensureCapacity()
        stringBuffer.ensureCapacity(20);
        System.out.println("9. Ensure Capacity: " + stringBuffer);

        // toString()
        System.out.println("10. To String: " + stringBuffer.toString());

        // substring(int start)
        System.out.println("11. Substring (start): " + stringBuffer.substring(2));

        // substring(int start, int end)
        System.out.println("12. Substring (start, end): " + stringBuffer.substring(2, 6));
    }

}
