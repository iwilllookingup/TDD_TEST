
package WordWrap;

public class WordWrap {

    private int count = 0;
    private char ch = ' ';

    public int wrap(String text) {

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ch) {
                count++;
            }
            System.out.println(count);
        }

        return count;
    }

}
