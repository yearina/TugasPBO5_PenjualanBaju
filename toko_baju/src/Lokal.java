public class Lokal extends Baju{
    @Override
    public void dataBaju() {
        id_baju[3]=104;
        merek[3]="Mayoutfit";
        ukuran[3]='L';
        warna[3]="Biru";
        harga[3]=80000;

        id_baju[4]=105;
        merek[4]="Tiara";
        ukuran[4]='M';
        warna[4]="Merah";
        harga[4]=100000;

        id_baju[5]=106;
        merek[5]="Clarissa";
        ukuran[5]='S';
        warna[5]="Coklat";
        harga[5]=95000;

        int no = 1;
        for (int i = 3; i < 6; i++) {
            System.out.print("["+no+"]");
            System.out.println(" Id baju: "+id_baju[i]);
            System.out.println("\tMerek: "+merek[i]);
            System.out.println("\tUkuran: "+ukuran[i]);
            System.out.println("\tWarna: "+warna[i]);
            System.out.println("\tHarga: "+harga[i]+"\n");
            no++;
        }
    }
}