public class Import extends Baju{
    String[] asal = new String[3];
    @Override
    public void dataBaju() {
        id_baju[0]=101;
        merek[0]="Uniqlo";
        ukuran[0]='S';
        warna[0]="Hitam";
        harga[0]=200000;

        id_baju[1]=102;
        merek[1]="Gucci";
        ukuran[1]='M';
        warna[1]="Putih";
        harga[1]=250000;

        id_baju[2]=103;
        merek[2]="Chanel";
        ukuran[2]='M';
        warna[2]="Putih";
        harga[2]=230000;

        for (int i = 0; i < 3; i++) {
            System.out.print("["+(i+1)+"]");
            System.out.println(" Id baju: "+id_baju[i]);
            System.out.println("\tMerek: "+merek[i]);
            System.out.println("\tUkuran: "+ukuran[i]);
            System.out.println("\tWarna: "+warna[i]);
            System.out.println("\tHarga: "+harga[i]+"\n");
        }
    }

    //overloading
    public void dataBaju(String asal1,String asal2,String asal3){
        id_baju[0]=101;
        merek[0]="Uniqlo";
        ukuran[0]='S';
        warna[0]="Hitam";
        harga[0]=200000;
        asal[0]=asal1;

        id_baju[1]=102;
        merek[1]="Gucci";
        ukuran[1]='M';
        warna[1]="Putih";
        harga[1]=250000;
        asal[1]=asal2;

        id_baju[2]=103;
        merek[2]="Chanel";
        ukuran[2]='M';
        warna[2]="Putih";
        harga[2]=230000;
        asal[2]=asal3;

        for (int i = 0; i < 3; i++) {
            System.out.print("["+(i+1)+"]");
            System.out.println(" Id baju: "+id_baju[i]);
            System.out.println("\tMerek: "+merek[i]);
            System.out.println("\tUkuran: "+ukuran[i]);
            System.out.println("\tWarna: "+warna[i]);
            System.out.println("\tHarga: "+harga[i]);
            System.out.println("\tAsal: "+asal[i]+"\n");
        }
    }
}
