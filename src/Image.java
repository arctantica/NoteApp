//Declare Image() to create Image with name inside brackets
public class Image {
    private final String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
