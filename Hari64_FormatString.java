package contoh ;
public class day64 {
    public static void main(String[] args) {
        String nama = "Nurlinda Ahmad";
        int umur = 19;
        double tinggi = 155.0;

        // Menggunakan String.format
        String hasilFormat = String.format("Nama: %s, Umur: %d tahun, Tinggi: %.1f cm", nama, umur, tinggi);
        System.out.println(hasilFormat);

        // Penggunaan System.out.printf
        System.out.printf("Nama: %s, Umur: %d tahun, Tinggi: %.1f cm%n", nama, umur, tinggi);
    }
}
