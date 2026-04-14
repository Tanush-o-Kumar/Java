import java.io.*;
import java.util.*;

public class StudentCSV {

    // ✅ File path set to students.csv (same project folder)
    static String filePath = "students.csv";

    public static void main(String[] args) {

        try {
            // 🔍 Show exact file location (for clarity)
            System.out.println("File location: " + new File(filePath).getAbsolutePath());

            createFile();
            addInitialRows();
            addMoreRows();
            updateMarks();
            calculatePercentage();
            deleteRow("102"); // delete student with ID 102
            displayFile();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    // 1️⃣ Create file + header
    static void createFile() throws IOException {
        FileWriter fw = new FileWriter(filePath);
        fw.write("studentId,name,branch,marks1,marks2,marks3,marks4,marks5,percentage\n");
        fw.close();
        System.out.println("File created successfully!");
    }

    // 2️⃣ Add initial rows
    static void addInitialRows() throws IOException {
        FileWriter fw = new FileWriter(filePath, true);

        fw.append("101,Tanush,AIML,89,99,95,0,0,0\n");
        fw.append("102,Anshuman,AIML,85,93,97,0,0,0\n");

        fw.close();
        System.out.println("Initial rows added!");
    }

    // 3️⃣ Add 3 more rows
    static void addMoreRows() throws IOException {
        FileWriter fw = new FileWriter(filePath, true);

        fw.append("103,Khushi,AIML,77,93,83,0,0,0\n");
        fw.append("104,Rahul,AIML,70,80,75,0,0,0\n");
        fw.append("105,Priya,AIML,88,92,90,0,0,0\n");

        fw.close();
        System.out.println("More rows added!");
    }

    // 4️⃣ Update marks4 and marks5
    static void updateMarks() throws IOException {
        List<String> lines = readFile();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");

            data[6] = "85"; // marks4
            data[7] = "90"; // marks5

            lines.set(i, String.join(",", data));
        }

        writeFile(lines);
        System.out.println("Marks updated!");
    }

    // 5️⃣ Calculate percentage
    static void calculatePercentage() throws IOException {
        List<String> lines = readFile();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");

            int m1 = Integer.parseInt(data[3]);
            int m2 = Integer.parseInt(data[4]);
            int m3 = Integer.parseInt(data[5]);
            int m4 = Integer.parseInt(data[6]);
            int m5 = Integer.parseInt(data[7]);

            double percentage = (m1 + m2 + m3 + m4 + m5) / 5.0;

            data[8] = String.valueOf(percentage);

            lines.set(i, String.join(",", data));
        }

        writeFile(lines);
        System.out.println("Percentage calculated!");
    }

    // 6️⃣ Delete a row
    static void deleteRow(String studentId) throws IOException {
        List<String> lines = readFile();
        List<String> updated = new ArrayList<>();

        updated.add(lines.get(0)); // header

        for (int i = 1; i < lines.size(); i++) {
            if (!lines.get(i).startsWith(studentId + ",")) {
                updated.add(lines.get(i));
            }
        }

        writeFile(updated);
        System.out.println("Row deleted for ID: " + studentId);
    }

    // 7️⃣ Read file
    static List<String> readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        List<String> lines = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();
        return lines;
    }

    // 8️⃣ Write file
    static void writeFile(List<String> lines) throws IOException {
        FileWriter fw = new FileWriter(filePath);

        for (String line : lines) {
            fw.write(line + "\n");
        }

        fw.close();
    }

    // 9️⃣ Display file
    static void displayFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        System.out.println("\nFinal CSV Content:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
