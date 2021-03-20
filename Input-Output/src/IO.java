import java.util.Scanner;//Scanner untuk membuat inputan
public class IO {
    public static void main(String[] args) throws Exception {
        Scanner masukkan=new Scanner(System.in);//instansiasi
        //Scanner namaterserah=new Scanner(System.in)
        String a,b;
        int c;
        //proses input adalah proses dimana user dapat memasukkan sebuah data yang nantinya akan ditampilkan
        System.out.println("Masukkan Nama:");
        a=masukkan.nextLine();
        //variabel=namaterserah.nextLine(untuk String)
        System.out.println("Masukkan NIM:");
        b=masukkan.nextLine();
        System.out.println("Masukkan Umur:");
        c=masukkan.nextInt();
        //variabel=namaterserah.nextInt(untuk integer)

        //menampilkan hasil input (output)
        System.out.println("====================================");
        System.out.println("Nama: "+a);
        System.out.println("Nim: "+b);
        System.out.println("Umur: "+c);
        System.out.println("====================================");

        System.out.println("\t\tGracias");
    }
}
