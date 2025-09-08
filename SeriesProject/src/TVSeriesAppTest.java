import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TVSeriesAppTest {

    @Test
    void TestSearchSeries() {
        SeriesManager manager = new SeriesManager();
        manager.addSeries(new TVSeries(1, "Test Show", "Comedy", 13));

        TVSeries result = manager.searchSeries(1);
        assertNotNull(result);
        assertEquals("Test Show", result.getName());
    }

    @Test
    void TestSearchSeries_SeriesNotFound() {
        SeriesManager manager = new SeriesManager();
        TVSeries result = manager.searchSeries(99);
        assertNull(result);
    }

    @Test
    void TestUpdateSeries() {
        SeriesManager manager = new SeriesManager();
        manager.addSeries(new TVSeries(1, "Old Name", "Drama", 16));

        boolean updated = manager.updateSeries(1, "New Name", "Action", 18);
        assertTrue(updated);
        assertEquals("New Name", manager.searchSeries(1).getName());
    }

    @Test
    void TestDeleteSeries() {
        SeriesManager manager = new SeriesManager();
        manager.addSeries(new TVSeries(1, "To Delete", "Horror", 18));

        boolean deleted = manager.deleteSeries(1);
        assertTrue(deleted);
        assertNull(manager.searchSeries(1));
    }

    @Test
    void TestDeleteSeries_SeriesNotFound() {
        SeriesManager manager = new SeriesManager();
        boolean deleted = manager.deleteSeries(99);
        assertFalse(deleted);
    }

    @Test
    void TestSeriesAgeRestriction_AgeValid() {
        SeriesManager manager = new SeriesManager();
        assertTrue(manager.validateAgeRestriction(13));
    }

    @Test
    void TestSeriesAgeRestriction_SeriesAgeInvalid() {
        SeriesManager manager = new SeriesManager();
        assertFalse(manager.validateAgeRestriction(3));
    }
}
