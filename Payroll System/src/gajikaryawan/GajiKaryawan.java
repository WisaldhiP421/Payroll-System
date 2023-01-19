package gajikaryawan;
import java.util.Scanner;

public class GajiKaryawan {
    String golongan;
    String kelamin;
    String status;
    int jmlanak;

    int gapok;
    int tunjist;
    int tunjank;

    public void setGolongan(String gol){
        this.golongan = gol;
    }

    public void setKelamin(String kel){
        this.kelamin = kel;
    }

    public void setStatus(String stat){
        this.status = stat;
    }

    public void setJmlanak(int jmank){
        this.jmlanak = jmank;
    }

    public int getGajipokok(){
        if (golongan.equalsIgnoreCase("A")){
            System.out.print("Gaji Pokok : Rp");
            return gapok = 1000000;
        } else if (golongan.equalsIgnoreCase("B")){
            System.out.print("Gaji Pokok : Rp");
            return gapok = 2000000;
        } else if (golongan.equalsIgnoreCase("C")){
            System.out.print("Gaji Pokok : Rp");
            return gapok = 3000000;
        } else if (golongan.equalsIgnoreCase("D")){
            System.out.print("Gaji Pokok : Rp");
            return gapok = 4000000;
        } else {
            System.out.println("Input Golongan Salah!"); 
        }
        return 0;
    }

    public int getTunjistri(){
        if (kelamin.equalsIgnoreCase("L") && status.equalsIgnoreCase("menikah")){
            System.out.print("Tunjangan Istri : Rp");
            return tunjist = gapok * 4/10;
        } else {
            System.out.print("Tunjangan Istri : Rp");
            return 0;
        }
    }

    public int getTunjanak(){
        if (jmlanak == 1 && status.equalsIgnoreCase("menikah")){
            System.out.print("Tunjangan Anak : Rp");
            return tunjank = gapok * 2/10;
        } else if(jmlanak == 2 && status.equalsIgnoreCase("menikah")){
            System.out.print("Tunjangan Anak : Rp");
            return tunjank = gapok * 4/10;
        } else if(jmlanak >= 3 && status.equalsIgnoreCase("menikah")){
            System.out.print("Tunjangan Anak : Rp");
            return tunjank = gapok * 6/10;
        } else {
            System.out.print("Tunjangan Anak : Rp");
            return 0;
        }
    }

    public int getTotalgaji(){
        System.out.print("Total Gaji Anda : Rp");
        return gapok + tunjist + tunjank;
    }


    //---Karyawan Harian---
        public int harikerja;

        public void setHarikerja(int hrkrj){
            this.harikerja = hrkrj;
        }
        public String getHarikerja(){
            if(!(harikerja >= 32) && !(harikerja <= 0)){
                return "Jumlah Hari Kerja : " + harikerja;
            } else {
                return "Jumlah Hari Kerja : Input Salah! (max:31)";
            }
        }

        public String getGaji(){
            if(!(harikerja >= 32) && !(harikerja <= 0)){
                return "Total Gaji Anda : Rp" + harikerja * 50000;
            } else {
                return "Total Gaji Anda : Input Salah!";
            }
        }

        //---Karyawan Tetap---
        public int getTetap(){
            System.out.print("Total Gaji Anda : Rp");
            return (gapok * 1/10) + gapok + tunjank + tunjist;
        }
}