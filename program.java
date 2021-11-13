import java.util.*;
import java.time.*;

public class program {
    public static LocalDate dateNow = LocalDate.now();

    public static void main(String[] args) {
        // Deklarasi object scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int n = 1, choose = 0;
        int totalHarga = 0;
        // Program utama
        while (n != 0) {
            tampilan();
            System.out.println("\t\t\t Total pembelian saat ini : Rp" + totalHarga);
            System.out.print("\nMasukkan pilihan kamu : ");
            n = sc.nextInt();

            if (n == 1) {
                makanan();
                System.out.println("Ketik 0 jika sudah selesai");
                while (true) {
                    System.out.print("Pilih makanan  : ");
                    choose = sc.nextInt();

                    // Jika makanan 0, maka akan keluar dari loop
                    // Jika makanan tidak 0, maka akan menambahkan harga makanan ke total harga

                    try {
                        if (choose == 0) {
                            break;
                        } else {
                            System.out.println("Kamu memilih " + makanan(choose));
                            totalHarga += hargaMakanan(choose);
                        }
                    } catch (Exception e) {
                        System.err.println("Pilihan tidak ada");
                    }

                } // end while makanan
            } // end if n == 1
            else if (n == 2) {
                minuman();
                System.out.println("Ketik 0 jika sudah selesai");
                while (true) {
                    System.out.print("Pilih minuman : ");
                    choose = sc.nextInt();

                    // Jika minuman 0, maka akan keluar dari loop
                    // Jika minuman tidak 0, maka akan menambahkan harga minuman ke total harga
                    try {
                        if (choose == 0) {
                            break;
                        } else {
                            System.out.println("Kamu memilih " + minuman(choose));
                            totalHarga += hargaMinuman(choose);
                        }
                    } catch (Exception e) {
                        System.err.println("Pilihan tidak ada");
                    }
                }
            }

        } // end while n != 0
        sc.close();
    }

    public static void tampilan() {
        garis();
        System.out.println("Selamat Datang di OveMart \t\t\t" + dateNow.getDayOfMonth() + "-"
                + dateNow.getMonthValue() + "-" + dateNow.getYear());
        garis();
        System.out.println();

        System.out.println("Menu : ");
        System.out.println("1. Makanan\n2. Minuman\n3. Snack\n4. Total Harga");
    }

    public static void makanan() {
        garis();
        System.out.println("Menu Makanan");
        garis();

        System.out.println("1. Nasi Goreng\t\t\t Rp 12.000");
        System.out.println("2. Nasi Uduk\t\t\t Rp 15.000");
        System.out.println("3. Nasi Pecel\t\t\t Rp 10.000");
        System.out.println("4. Nasi Ayam\t\t\t Rp 8.000");
        System.out.println("5. Nasi Campur\t\t\t Rp 7.000");
        System.out.println("6. Nasi Goreng Ayam\t\t Rp 15.000");
        System.out.println("7. Nasi Goreng Telur\t\t Rp 9.000");
        System.out.println("8. Nasi Goreng Sapi\t\t Rp 12.000");
        System.out.println("9. Nasi Goreng Kerang\t\t Rp 15.000");
        System.out.println("10. Nasi Goreng Kambing\t\t Rp 15.000");

        System.out.println();

    }

    public static String makanan(int makan) {
        String namaMakanan[] = { "Nasi Goreng", "Nasi Uduk", "Nasi Pecel", "Nasi Ayam", "Nasi Campur",
                "Nasi Goreng Ayam", "Nasi Goreng Telur", "Nasi Goreng Sapi", "Nasi Goreng Kerang",
                "Nasi Goreng Kambing" };
        return namaMakanan[makan - 1];
    }

    public static int hargaMakanan(int harga) {
        int hargaMakanan[] = { 12000, 15000, 10000, 8000, 7000, 15000, 9000, 12000, 15000, 15000 };
        return hargaMakanan[harga - 1];
    }

    public static void minuman() {
        garis();
        System.out.println("Menu Minuman");
        garis();

        System.out.println("1. Es Teh\t\t Rp 5.000");
        System.out.println("2. Es Jeruk\t\t Rp 5.500");
        System.out.println("3. Es Teh Manis\t\t Rp 5.500");
        System.out.println("4. Es Jeruk Manis\t Rp 6.000");
        System.out.println("5. Es Jeruk Lemon\t Rp 6.000");
        System.out.println("6. Es Jeruk Lemon Manis\t Rp 6.500");

        System.out.println();
    }

    public static String minuman(int minum) {
        String namaMinuman[] = { "Es Teh", "Es Jeruk", "Es Teh Manis", "Es Jeruk Manis", "Es Jeruk Lemon",
                "Es Jeruk Lemon Manis" };
        return namaMinuman[minum - 1];
    }

    public static int hargaMinuman(int minum) {
        int hargaMinuman[] = { 5000, 5500, 5500, 6000, 6000, 6500 };
        return hargaMinuman[minum - 1];
    }

    public static void snack() {
        garis();
        System.out.println("Menu Snack");
        garis();

        System.out.println("1. Lays\t\t\t Rp10.000");
        System.out.println("2. Chips\t\t\t Rp 12.000");
        System.out.println("3. Popcorn\t\t\t Rp 15.000");
        System.out.println("4. Nescafe\t\t\t Rp 7.000");
        System.out.println("5. Nescafe Milo\t\t Rp 9.000");
        System.out.println("6. Chitato\t\t\t Rp 11.000");
        System.out.println("7. Taro\t\t\t Rp 8.000");

        System.out.println();
    }

    public static String snack(int snack) {
        String namaSnack[] = { "Lays", "Chips", "Popcorn", "Nescafe", "Nescafe Milo", "Chitato", "Taro" };
        return namaSnack[snack - 1];
    }

    public static int hargaSnack(int snack) {
        int hargaSnack[] = { 10000, 12000, 15000, 7000, 9000, 11000, 8000 };
        return hargaSnack[snack - 1];
    }

    public static void garis() {
        System.out.println("===========================================================");
    }

}
