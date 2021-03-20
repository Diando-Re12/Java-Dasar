import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) throws Exception {

        //Switch case adalah penyederhanaan dari if-else dan digunakan untuk pemilihan
        Scanner masuk=new Scanner(System.in);
        int hari;

        System.out.println("==============================");
        System.out.println("\t\tPILIH HARI");
        System.out.println("1.SENIN");
        System.out.println("2.SELASA");
        System.out.println("3.RABU");
        System.out.println("4.KAMIS");
        System.out.println("5.JUMAT");
        System.out.println("6.SABTU");
        System.out.println("7.MINGGU");
        System.out.print("Masukkan kode >>");
        hari=masuk.nextInt();
        System.out.println("==============================");
        switch (hari) {
            case 1:
                System.out.println("Senin itu waktunya sambut hari");
                break;
            case 2:
                System.out.println("Selasa waktu yang indah untuk kerja lembur");
                break;
            case 3:
                System.out.println("Rabu itu waktunya menyelesaikan deadline kerja");
                break;
            case 4:
                System.out.println("Kamis itu waktu terberatmu");
                break;
            case 5:
                System.out.println("Jumat itu waktunya semua kebaikan mengucur");
                break;
            case 6:
                System.out.println("Titik jenuh membuatmu lelah ya?,sini jalan sama aku");
                break;
            case 7:
                System.out.println("Minggu,hari yang baikmelepas penat dan siap bertarung dihari esok");
                break;
            default://selain case disitu dan pilihan salah maka dan di eksekusi oleh default
                break;
        }


    }
}
