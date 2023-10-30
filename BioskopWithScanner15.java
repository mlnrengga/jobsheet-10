import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true){
            System.out.print("Masukkan Nama  : ");
            nama = input15.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = input15.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = input15.nextInt();
            
            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton Lainnya? (y/n) : ");
            next = input15.next();

            if (next.equalsIgnoreCase("n")) {
                break;    
            }
        }
        input15.close();
    }
}
