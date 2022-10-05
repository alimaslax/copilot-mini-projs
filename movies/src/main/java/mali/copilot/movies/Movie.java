/*
        {
            "adult": false,
            "backdrop_path": "/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg",
            "genre_ids": [
                27,
                53
            ],
            "id": 760161,
            "original_language": "en",
            "original_title": "Orphan: First Kill",
            "overview": "After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.",
            "popularity": 7115.298,
            "poster_path": "/wSqAXL1EHVJ3MOnJzMhUngc8gFs.jpg",
            "release_date": "2022-07-27",
            "title": "Orphan: First Kill",
            "video": false,
            "vote_average": 7,
            "vote_count": 797
        }
 */
// create a new entity class called Movie based on the json above and create the getters and setters for the fields.
// Give the id field the @Id annotation and the @GeneratedValue annotation with the strategy of GenerationType.AUTO
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String overview;
    private String release_date;
    private String poster_path;
    private String backdrop_path;
    private String original_language;
    private String original_title;
    private boolean adult;
    private String video;
    private double vote_average;
    private int vote_count;
    private double popularity;
    private int[] genre_ids;
    // create a new constructor that takes all the fields as parameters
    public Movie(String title, String overview, String release_date, String poster_path, String backdrop_path, String original_language, String original_title, boolean adult, String video, double vote_average, int vote_count, double popularity, int[] genre_ids) {
        this.title = title;
        this.overview = overview;
        this.release_date = release_date;
        this.poster_path = poster_path;
        this.backdrop_path = backdrop_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.adult = adult;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.popularity = popularity;
        this.genre_ids = genre_ids;
    }
    // create a new constructor that takes no parameters
    public Movie() {
    }
    // create the getters and setters for the fields
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public String getRelease_date() {
        return release_date;
    }
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
    public String getPoster_path() {
        return poster_path;
    }
    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
    public String getBackdrop_path() {
        return backdrop_path;
    }
    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }
    public String getOriginal_language() {
        return original_language;
    }
    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }
    public String getOriginal_title() {
        return original_title;
    }
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
    public boolean isAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public String getVideo() {
        return video;
    }
    public void setVideo(String video) {
        this.video = video;
    }
    public double getVote_average() {
        return vote_average;
    }
    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }
    public int getVote_count() {
        return vote_count;
    }
    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }
    public double getPopularity() {
        return popularity;
    }
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
    public int[] getGenre_ids() {
        return genre_ids;
    }
    public void setGenre_ids(int[] genre_ids) {
        this.genre_ids = genre_ids;
    }
}