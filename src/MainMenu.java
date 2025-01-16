import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class MainMenu {
    public static  List<Note> notes = new ArrayList<>();

    //print out list of all notes
    public static void displayNotes() {
        for(Note note : notes){
            System.out.println(note.id + ": " + note.name);
        }
    }

    //Create new note
    public  static  void createNote(){
        Note note = new Note();
        notes.add(note);
    }

    public static void deleteNote(String noteName){
        notes.removeIf(note -> Objects.equals(note.name, noteName));
    }
}
