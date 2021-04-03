import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given
        // when
        Phonebook phoneBook = new Phonebook();

        // then
        Assert.assertTrue(phoneBook.getPhonebook() instanceof HashMap);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        LinkedHashMap<String, List<String>> dependency = new LinkedHashMap<>();

        // when
        Phonebook phoneBook = new Phonebook(dependency);

        // then
        Assert.assertEquals(dependency, phoneBook.getPhonebook());
    }
}