import org.junit.Assert;
import org.junit.Test;

public class RemoveTest {
    @Test
    public void test1() {
        // given
        Phonebook phoneBook = new Phonebook();
        String name = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }

    @Test
    public void test2() {
        // given
        Phonebook phoneBook = new Phonebook();
        String name = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }


    @Test
    public void test3() {
        // given
        Phonebook phoneBook = new Phonebook();
        String name = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }
}