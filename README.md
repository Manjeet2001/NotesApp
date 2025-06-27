# 📝 Java Notes App (File I/O + OOP)

A simple yet advanced **text-based Notes Manager** built in Java.  
This app lets you **write, view, search, and delete notes** — and stores them in a local file using Java File I/O with a clean object-oriented design.

---

## 📌 Objective

Build a Java console application to:
- Write timestamped notes
- Persist notes using file handling
- Apply OOP concepts like classes and encapsulation

---

## 🛠 Tools & Tech

- **Language:** Java 21
- **Tools:** VS Code 
- **Java Features:** FileReader, FileWriter, BufferedReader, OOP, Collections

---

## 📁 Project Structure
  ```bash
NotesApp/
├── Note.java # Model class with note content & timestamp
├── NoteManager.java # Handles file I/O and note operations
└── Main.java # CLI interface for the user
```

---

## ✅ Features

| Feature         | Description                                                                 |
|----------------|-----------------------------------------------------------------------------|
| 📝 Write Note    | Add a new note with current timestamp and save it to `notes.txt`           |
| 📖 View Notes    | Display all saved notes with index numbers                                 |
| 🔍 Search Notes  | Search for notes containing a specific keyword                             |
| 🗑️ Delete Note   | Delete a note by its number from the list                                  |
| 💾 Persistent    | All data is saved in `notes.txt` for future use                            |
| 🧱 OOP Structure | Organized code into classes (`Note`, `NoteManager`)                         |

---

## 🚀 How to Run

1. Clone or download the project.
   ```bash
   git clone https://github.com/Manjeet2001/NotesApp.git
2. Open terminal in the project directory.
3. Compile all files:
   ```bash
   javac *.java
4. Run Program:
   ```bash
   java Main
