import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, aC, lantai, ketersediaan, hasil;
        int kapasitas, jumlah, skor;
        double penggunaan;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor > 40) {
            hasil = "Gudang Elite";
        } else {
            if (skor >= 25 && skor < 40) {
                hasil = "Gudang Standar";
            } else {
                if (skor < 25) {
                    hasil = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + hasil);
    }
}
