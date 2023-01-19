package gajikaryawan;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int pilih;
        String lagi = "y";
        Scanner input = new Scanner(System.in);
        GajiKaryawan karyawan = new GajiKaryawan();

        while(lagi.equalsIgnoreCase("Y"))
        {
            System.out.println("---------------------------");
            System.out.println("---Menu Perhitungan Gaji---");
            System.out.println("---------------------------");
            System.out.println("1. Karyawan Biasa");
            System.out.println("2. Karyawan Harian");
            System.out.println("3. Karyawan Kontrak");
            System.out.println("4. Karyawan Tetap");
            System.out.println("---------------------------");
            
            System.out.println();

            System.out.print("Input Pilihan : ");
            pilih = input.nextInt();

            if (pilih == 1){
                System.out.println();
                System.out.println("------ Karyawan Biasa ------");
                
                System.out.print("Input Golongan [A/B/C/D] : ");
                karyawan.setGolongan(input.next());

                System.out.print("Input Kelamin [L/P] : ");
                karyawan.setKelamin(input.next());

                System.out.print("Input Status [menikah/belum] : ");
                karyawan.setStatus(input.next());

                System.out.print("Input Jumlah Anak : ");
                karyawan.setJmlanak(input.nextInt());
                
                System.out.println();
                System.out.println("---------- Hasil ----------");
                System.out.println(karyawan.getGajipokok());
                System.out.println(karyawan.getTunjistri());
                System.out.println(karyawan.getTunjanak());
                System.out.println(karyawan.getTotalgaji());

                System.out.println();
                System.out.print("Ingin Menghitung Lagi? [Y/T] : ");
                lagi = input.next();
            
            }
            else if (pilih == 2){
                System.out.println();
                System.out.println("------ Karyawan Harian ------");
                
                System.out.print("Input Jumlah Hari Kerja : ");
                karyawan.setHarikerja(input.nextInt());
                
                System.out.println();
                System.out.println("---------- Hasil ----------");
                System.out.println("Gaji Pokok : Rp50000");
                System.out.println(karyawan.getHarikerja());
                System.out.println(karyawan.getGaji());

                System.out.println();
                System.out.print("Ingin Menghitung Lagi? [Y/T] : ");
                lagi = input.next();
            }

            else if (pilih == 3){
                System.out.println();
                System.out.println("------ Karyawan Kontrak ------");

                System.out.print("Input Golongan : ");
                karyawan.setGolongan(input.next());

                System.out.println();
                System.out.println("---------- Hasil ----------");
                System.out.println(karyawan.getGajipokok());

                System.out.println();
                System.out.print("Ingin Menghitung Lagi? [Y/T] : ");
                lagi = input.next();
            }

            else if (pilih == 4){
                System.out.println();
                System.out.println("------ Karyawan Tetap ------");
               
                System.out.print("Input Golongan [A/B/C/D] : ");
                karyawan.setGolongan(input.next());

                System.out.print("Input Kelamin [L/P] : ");
                karyawan.setKelamin(input.next());

                System.out.print("Input Status [menikah/belum] : ");
                karyawan.setStatus(input.next());

                System.out.print("Input Jumlah Anak : ");
                karyawan.setJmlanak(input.nextInt());

                System.out.println();
                System.out.println("---------- Hasil ----------");
                System.out.println(karyawan.getGajipokok());
                System.out.println(karyawan.getTunjistri());
                System.out.println(karyawan.getTunjanak());
                System.out.println("Bonus Karyawan Tetap : 10% Gapok");
                System.out.println(karyawan.getTetap());

                System.out.println();
                System.out.print("Ingin Menghitung Lagi? [Y/T] : ");
                lagi = input.next();
            }

            else {
                System.out.println("Input Salah!");
            }

        }

    }
}
