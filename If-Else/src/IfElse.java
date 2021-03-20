public class IfElse {
    public static void main(String[] args) throws Exception {

        //If-Else/kondisi,yaitu percabangan dimana ada 2/lebih kondisi yang akan menentukan jalan selanjutnya
        String kamu ="Ditinggal";
        String dia="Tidak Cantik";
        
        if (kamu=="Jodohku") {// if/jika kondisi itu benar
            if (dia=="Cantik"){
                System.out.println("Kamu adalah bukti,dari cantiknya paras dan hati");
            }
            else{
                System.out.println("Tetaplah Bersamaku,jadi teman hidupku");//kode
            }
        }
        else if(kamu=="Ditinggal"){
            System.out.println("Mengapa..... Aku begini");
        } 
        else {// else pernyataan apabila si if tidak benar/salah,maka dilanjutkan ke proses else
            System.out.println("Maaf sepertinya kita belum dipertemukan");
        }
    }
}
