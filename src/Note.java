import java.util.List;
import java.util.ArrayList;

public class Note {
    public String name;
    private String text;
    private static List<Image> photos = new ArrayList<Image>();
    private List<Video> videos = new ArrayList<Video>();
    public int id;

    static void addImage(String image1){
        Image img = new Image(image1);
        photos.add(img);
        System.out.println("Added image: " + image1);
    }

    static List<Image> getImages(List<Image> images){
        return  images;
    }

    static Video addVideo(Video video) {
        return video;
    }

    static List<Video> getVideos(List<Video> videos){
        return videos;
    }

    static int getId(int x){
        return x;
    }
}
