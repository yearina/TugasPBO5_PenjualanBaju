public class Baju {
    public int[] id_baju = new int[6];
    protected String[] merek = new String[6];
    protected char[] ukuran = new char[6];
    protected String[] warna = new String[6];
    protected int[] harga = new int[6];

    public void dataBaju(){
        for (int i = 0; i < 6; i++) {
            id_baju[i]=0;
        }
        System.out.println("Data baju kosong!!!");
    }
}