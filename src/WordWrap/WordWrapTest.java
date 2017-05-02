
package WordWrap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordWrapTest {

    private WordWrap word = new WordWrap();

    @Test
    public void input_word_should_return_0() {
        String text = "word";
        System.out.println(text);
        assertEquals(0, word.wrap(text));

    }

    @Test
    public void input_beautiful_girl_hahaha_should_return_4() {
        String text = "beautiful girl hahaha\nbe ha"
                + "hahahaha haha";
        System.out.println(text);
        assertEquals(4, word.wrap(text));
    }

}
