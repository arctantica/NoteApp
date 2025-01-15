public class Video {
    private String title; // A private field to store the title of the video.

    // Constructor: Initializes the 'title' field when a Video object is created.
    public Video(String title) {
        this.title = title;
    }

    // Overrides the toString method to return the title of the video as a string.
    @Override
    public String toString() {
        return title;
    }
}
