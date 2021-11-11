import java.util.*;

public class program {
    public static void main(String[] args) {
        // Deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        // Deklarasi variabel
        int n = 1, makan = 0;
        int totalHarga = 0;
        // Program utama
        while (n != 0) {
            tampilan();
            System.out.println("\t\t\t Total pembelian saat ini : Rp." + totalHarga);
            System.out.print("\nMasukkan pilihan kamu : ");
            n = sc.nextInt();

            if (n == 1) {
                makanan();
                System.out.println("Ketik 0 jika sudah selesai");
                while (true) {
                    int[] hargaMakanan = { 12000, 15000, 10000, 8000, 7000, 15000, 9000, 12000, 15000, 15000 };

                    System.out.print("Pilih makanan  : ");
                    makan = sc.nextInt();

                    // Jika makanan 0, maka akan keluar dari loop
                    // Jika makanan tidak 0, maka akan menambahkan harga makanan ke total harga

                    if (makan == 0) {
                        break;
                    } else {
                        totalHarga += hargaMakanan[makan - 1];
                    }

                } // end while makanan 
            } // end if n == 1

        } // end while n != 0
        sc.close();
    }

    public static void tampilan() {
        garis();
        System.out.printf("Selamat datang di %s \t\t\t 12-11-2021 \n", "Syaharrasa");
        garis();
        System.out.println();

        System.out.println("Menu : ");
        System.out.println("1. Makanan\n2. Minuman\n3. Snack\n4. Total Harga");
    }

    public static void makanan() {
        garis();
        System.out.println("Menu Makanan");
        garis();

        System.out.println("1. Nasi Goreng\t\t\t Rp. 12.000");
        System.out.println("2. Nasi Uduk\t\t\t Rp. 15.000");
        System.out.println("3. Nasi Pecel\t\t\t Rp. 10.000");
        System.out.println("4. Nasi Ayam\t\t\t Rp. 8.000");
        System.out.println("5. Nasi Campur\t\t\t Rp. 7.000");
        System.out.println("6. Nasi Goreng Ayam\t\t Rp. 15.000");
        System.out.println("7. Nasi Goreng Telur\t\t Rp. 9.000");
        System.out.println("8. Nasi Goreng Sapi\t\t Rp. 12.000");
        System.out.println("9. Nasi Goreng Kerang\t\t Rp. 15.000");
        System.out.println("10. Nasi Goreng Kambing\t\t Rp. 15.000");

        System.out.println();

    }

    public static void garis() {
        System.out.println("===========================================================");
    }

}
