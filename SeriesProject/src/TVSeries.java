public class TVSeries {
    private final int id;
    private String name;
    private String genre;
    private int ageRestriction;

    // Constructor
    public TVSeries(int id, String name, String genre, int ageRestriction) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
    }

    // Getters (Info Hiding)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getAgeRestriction() { return ageRestriction; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }

    @Override
    public String toString() {
        return "TVSeries{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}
