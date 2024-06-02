import java.util.*;
import java.util.Hashtable;

public class HashTableJava {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pembunuhMap = new HashMap<>();
        Set<String> korbanSet = new HashSet<>();

        // Membaca input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                break;
            }
            String[] names = line.split(" ");
            String pembunuh = names[0];
            String korban = names[1];

            // Menambahkan pembunuh dan korban ke dalam struktur data
            pembunuhMap.put(pembunuh, pembunuhMap.getOrDefault(pembunuh, 0) + 1);
            korbanSet.add(korban);
        }
