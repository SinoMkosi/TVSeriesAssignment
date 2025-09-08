import java.util.ArrayList;

public class SeriesManager {
    private final ArrayList<TVSeries> seriesList = new ArrayList<>();

    // Add series
    public void addSeries(TVSeries series) {
        seriesList.add(series);
    }

    // Search series
    public TVSeries searchSeries(int id) {
        for (TVSeries s : seriesList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update series
    public boolean updateSeries(int id, String newName, String newGenre, int newAgeRestriction) {
        TVSeries series = searchSeries(id);
        if (series != null) {
            series.setName(newName);
            series.setGenre(newGenre);
            series.setAgeRestriction(newAgeRestriction);
            return true;
        }
        return false;
    }

    // Delete series
    public boolean deleteSeries(int id) {
        TVSeries series = searchSeries(id);
        if (series != null) {
            seriesList.remove(series);
            return true;
        }
        return false;
    }

    // Validate Age Restriction
    public boolean validateAgeRestriction(int age) {
        return age >= 7 && age <= 21;
    }

    // Report all series
    public void printReport() {
        System.out.println("=== TV Series Report ===");
        for (TVSeries s : seriesList) {
            System.out.println(s);
        }
    }

    public ArrayList<TVSeries> getAllSeries() {
        return seriesList;
    }
}

