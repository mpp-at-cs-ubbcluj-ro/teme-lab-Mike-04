import com.Main;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    public void testAddToList() {
        System.out.println("testAddToList");
        List<String> list = Lists.newArrayList();
        Main.addToList(list, "Hello");
        Main.addToList(list, "World");

        assertEquals(2, list.size());
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }

    @Test
    public void testRemoveElement() {
        System.out.println("testRemoveElement");
        List<String> list = Lists.newArrayList();
        Main.addToList(list, "Hello");
        Main.addToList(list, "World");
        Main.removeElement(list, "Hello");

        assertEquals(1, list.size());
        assertEquals("World", list.get(0));
    }

    @Test
    public void testGetConcatenatedString() {
        System.out.println("testGetConcatenatedString");
        List<String> list = Lists.newArrayList();
        Main.addToList(list, "Hello ");
        Main.addToList(list, "World");
        Main.addToList(list, "!");
        Main.addToList(list, ".");
        Main.removeElement(list, ".");

        assertEquals("Hello World!", Main.getConcatenatedString(list));
    }

}