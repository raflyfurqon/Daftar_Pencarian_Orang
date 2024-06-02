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
        scanner.close();

        // Menghapus pembunuh yang juga merupakan korban
        for (String korban : korbanSet) {
            pembunuhMap.remove(korban);
        }
        // Mengurutkan nama pembunuh secara abjad
        List<String> daftarPembunuh = new ArrayList<>(pembunuhMap.keySet());
        Collections.sort(daftarPembunuh);

        // Menampilkan output
        System.out.println("DAFTAR PENCARIAN ORANG KASUS PEMBUNUHAN");
        for (String pembunuh : daftarPembunuh) {
            System.out.println(pembunuh + " " + pembunuhMap.get(pembunuh));
        }
    }
}
