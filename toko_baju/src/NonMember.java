public class NonMember extends Pembeli{
    @Override
    public void tambahData(int id_pembeli, String nama) {
        super.tambahData(id_pembeli, nama);
    }

    @Override
    public int updateData(int no, int id, String name) {
        return super.updateData(no, id, name);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public double potongan(double total) {
        if(total>=500000){
            return 0.01*total;
        }
        return 0;
    }
}
