public class TVSeriesApp {
    public static void main(String[] args) {
        SeriesManager manager = new SeriesManager();

        // Add some demo series
        manager.addSeries(new TVSeries(1, "Stranger Things", "Sci-Fi", 16));
        manager.addSeries(new TVSeries(2, "Peppa Pig", "Kids", 7));
        manager.addSeries(new TVSeries(3, "Breaking Bad", "Drama", 18));

        // Initial Report
        manager.printReport();

        // Update test
        System.out.println("\nUpdating Series with ID 1...");
        manager.updateSeries(1, "Stranger Things (Updated)", "Horror/Sci-Fi", 16);
        manager.printReport();

        // Delete test
        System.out.println("\nDeleting Series with ID 2...");
        manager.deleteSeries(2);
        manager.printReport();
    }
}
