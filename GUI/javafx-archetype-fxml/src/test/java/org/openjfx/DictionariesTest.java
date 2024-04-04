package org.openjfx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DictionariesTest {
    @Test
    void testReadFileToList() {
        Dictionaries dictionary = new Dictionaries();

        List<String> result = dictionary.readFileToList("/Dictionaries/TestDictionary.txt");

        assertNotNull(result, "The result should not be null.");
        assertEquals(5, result.size(), "The result list should contain 3 items.");

        //sjekker om dictionary listen har ordene i filen.
        assertEquals(List.of("ord1", "ord2", "ord3","ord4","ord5"), result, "The list content does not match expected.");
    }
}
