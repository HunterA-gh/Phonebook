import org.junit.Assert;
import org.junit.Test;

public class ReverseLookupTest {
    @Test
    public void test1() {
        // given
        Phonebook phoneBook = new Phonebook();
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookUp(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        Phonebook phoneBook = new Phonebook();
        String expectedName = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookUp(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void test3() {
        // given
        Phonebook phoneBook = new Phonebook();
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookUp(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}