
import java.io.*;
import java.util.*;

public class NoteManager {
    private static final String FILE_NAME = "notes.txt";

    public void writeNote(Note note){
        try(FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note.getTimestamp() + "|" + note.getContent() + "\n");
            System.out.println("Note saved successfully.");
        } catch (Exception e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }

    public List<Note> readNotes(){
        List<Note> notes = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split("\\|", 2);
                if (parts.length == 2) {
                    notes.add(new Note(parts[1], parts[0]));
                }
            }
        } catch(IOException e){
            System.out.println("Error reading notes: " + e.getMessage());
        }
        return notes;
    }

    public void showNotes(List<Note> notes){
        if(notes.isEmpty()){
            System.out.println("No notes found");
            return;
        }
        int ind = 1;
        for(Note note : notes){
            System.out.println(ind++ + ". " + note);
        }
    }

    public void searchNotes(String key){
        List<Note> notes = readNotes();
        boolean found = false;
        for(Note note: notes){
            if (note.getContent().toLowerCase().contains(key.toLowerCase())) {
                System.out.println(note);
                found = true;
            }
        }
        if(!found){
            System.out.println("No matching notes found");
        }

    }

    public void deleteNotes(int noteIndex){
        List<Note> notes = readNotes();
        if(noteIndex < 1 || noteIndex > notes.size()){
            System.out.println("Invalid note number");
            return;
        }
        notes.remove(noteIndex - 1);
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            for (Note note : notes) {
                writer.write(note.getTimestamp() + "|" + note.getContent() + "\n");
            }
            System.out.println("Note deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting note: " + e.getMessage());
        }
    }
}