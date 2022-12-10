public class Member extends Pembeli{
    String notelp;
    @Override
    public void tambahData(int id_pembeli, String nama) {
        super.tambahData(id_pembeli, nama);
    }

    //overloading
    public void tambahData(int id_pembeli, String nama, String notelp) {
        super.tambahData(id_pembeli, nama);
        this.notelp=notelp;
    }
    @Override
    public int updateData(int no, int id, String name) {
        return super.updateData(no, id, name);
    }

    //overloading
    public int updateData(int no, int id, String name, String notelp) {
        this.notelp = notelp;
        return super.updateData(no, id, name);

    }
    @Override
    public void display() {
        super.display();
        System.out.println("\tNo telp: "+getNotelp());
    }

    @Override
    public double potongan(double total) {
        if(total>=500000){
            return 0.05*total;
        }
        return 0;
    }

    public String getNotelp() {
        return notelp;
    }

}