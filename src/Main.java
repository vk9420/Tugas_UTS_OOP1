import java.util.Scanner;
public class Main extends Proses_Bensin{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Proses_Bensin ob= new Proses_Bensin();
        int kegiatan;
        int kapacity=500;

        System.out.println("Stok bensin sekarang= "+kapacity+" liter");
        System.out.println("Masukkan kegiatan Pertamini");
        System.out.println("Angka 1 untuk Memasukkan Bensin");
        System.out.println("Angka 2 untuk Mengeluarkan Bensin");
        System.out.println("Angka 3 untuk Melakukan Transaksi Jual Bensin");
        System.out.println("Masukkan Angka=");
        kegiatan=input.nextInt();
        switch(kegiatan){
            case 1:
                System.out.println("Masukkan jumlah bensin masuk dalam liter= ");
                int masuk = input.nextInt();
                System.out.println(ob.masukBensin(masuk));
                break;
            case 2:
                System.out.println("Masukkan jumlah bensin yang keluar dalam liter= ");
                int keluar= input.nextInt();
                System.out.println(ob.keluarBensin(keluar));
                break;
            case 3:
                System.out.println("Masukkan jumlah bensin terjual dalam liter= ");
                int liter= input.nextInt();
                System.out.println(ob.hitungJualBensin(liter));
                break;

        }
    }
}



