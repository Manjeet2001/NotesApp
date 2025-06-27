import java.util.*;

public class Main {
    public static void main(String[] args){
        NoteManager manager = new NoteManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Write Note");
            System.out.println("2. View All Notes");
            System.out.println("3. Search Notes");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String content = sc.nextLine();
                    manager.writeNote(new Note(content));
                    break;
                case 2:
                    manager.showNotes(manager.readNotes());
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    manager.searchNotes(keyword);
                    break;
                case 4:
                    manager.showNotes(manager.readNotes());
                    System.out.print("Enter note number to delete: ");
                    int noteNum = sc.nextInt();
                    sc.nextLine();
                    manager.deleteNotes(noteNum);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        while(choice != 5);
        sc.close();
    }
}