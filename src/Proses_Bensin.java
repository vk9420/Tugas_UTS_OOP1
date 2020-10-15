public class Proses_Bensin extends Alert implements Pertamini{
    private int kapasitas;
    private int capacity;

    public Proses_Bensin() {
        kapasitas = 500;
    }

        @Override
        public int masukBensin(int msk) {
            capacity =kapasitas+msk;
            if (capacity==kapasitasMax) {
                System.out.println(bensinPenuh());
            }
            else if (capacity>kapasitasMax){
                int lebih=kapasitas-msk;
                int lbh=lebih*-1;
                System.out.println(bensinPenuh()+"Kelebihan="+lbh+" liter");
            }
            else {
                System.out.println("Jumlah Liter Bensin Sekarang= "+capacity+" liter");
            }
           return 0;

        }

        @Override
        public int keluarBensin(int klr) {
            capacity =kapasitas-klr;
            if (capacity==kapasitasMin) {
                System.out.println(bensinHabis());
            }
            else if (capacity<kapasitasMin){
                System.out.println("Bensin Yang Dikeluarkan Lebih Banyak Daripada Isi di Pertamini");
            }
            else {
                System.out.println ("Jumlah Liter Bensin Sekarang= "+capacity+" liter");
            }
            return 0;
        }

        @Override
        public int hitungJualBensin(int ltr) {
            capacity =kapasitas-ltr;
            int harga=ltr*8000;
            if (capacity==kapasitasMin) {
                System.out.println(bensinHabis());
            }
            else if (capacity<kapasitasMin){
                System.out.println("Bensin Yang Dikeluarkan Lebih Banyak Daripada Isi di Pertamini");
            }
            else {
                System.out.println("Jual Bensin sebanyak "+ltr+" liter seharga=Rp "+harga);
                System.out.println ("Jumlah Liter Bensin Sekarang= "+capacity+" liter");
            }
        return 0;
        }


}
