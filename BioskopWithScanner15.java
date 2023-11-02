import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int baris, kolom, menutItem;
        String nama, next;
        String[][] penonton = new String[4][2];
        Boolean pilihan = true;
        while (pilihan) {
            System.out.println("---------------PILIH MENU--------------");
            System.out.println("\n1.Input Data Penonton");
            System.out.println("2.Tampilkan Daftar Penonton");
            System.out.println("3.Exit");
            System.out.print("Masukkan Menu : ");
            menutItem = input15.nextInt();
            input15.nextLine();
            System.out.println();

            switch (menutItem) {
                case 1:
                        System.out.print("Masukkan Nama: ");
                        nama = input15.nextLine();
                        while (true) {
                        System.out.print("Masukkan Baris: ");
                        baris = input15.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        kolom = input15.nextInt();
                        input15.nextLine();
                        if ((baris - 1) >= penonton.length || (kolom - 1) >= penonton[baris - 1].length)
                            System.out.println("Baris Atau Kolom Kursi Tidak Tersedia");
                        else if (penonton[baris - 1][kolom - 1] == null)
                        penonton[baris - 1][kolom - 1] = nama;
                        else {
                            System.out.println("WARNING!, Kursi Yang Anda Pilih Telah Terisi");
                            System.out.println("Masukkan Baris Dan Kolom Kembali");
                        continue;
                        }
                        break;
                    }
                        System.out.print("Input Penonton Lainnya? (y/n): ");
                        next = input15.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                     
                }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton baris ke-" + i + ": ");
                        Boolean selanjutnya = false;
                        for (String j : penonton[i]) {
                            if (selanjutnya)
                            System.out.print(", ");
                            System.out.print((j == null) ? "***" : j);
                            selanjutnya = true;
                        }
                        System.out.println();
                    }
                        break;
                case 3:
                    pilihan = false;
                    break;
                default:
                        System.out.println("Menu tidak " + menutItem +" ada");
                break;
                }
        }
                input15.close();
    }
}