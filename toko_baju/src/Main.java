import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Member mem = new Member();
        NonMember non = new NonMember();
        Kasir kas1 = new Kasir();
        Kasir kas2 = new Kasir();
        Baju baj = new Baju();
        Import imp = new Import();
        Lokal lok = new Lokal();
        Transaksi trans = new Transaksi();
        int menu, pilih, n, no, i;
        int[] id2 = new int[10];
        int id4, harga4, jumlah4;
        String tgl;
        String[] name2 = new String[10];
        String[] notelp2 = new String[10];
        char ulang, member;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\t\tDATA PENJUALAN TOKO BAJU");
            System.out.println("\t\t------------------------");
            System.out.println("Menu:");
            System.out.println("1. Daftar Baju");
            System.out.println("2. Data Pembeli");
            System.out.println("3. Data kasir");
            System.out.println("4. Transaksi");
            System.out.println("-------------------------------");
            System.out.print("Masukkan menu yang dipilih: ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Daftar baju");
                    System.out.println("-----------");
                    System.out.println("1. Import");
                    System.out.println("2. Lokal");
                    System.out.println("----------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Baju Import");
                        System.out.println("-----------");
                        for (i = 0; i < 3; i++) {
                            if (imp.id_baju[0] == 0) {
                                System.out.print("["+(i+1)+"]");
                                baj.dataBaju();
                            }
                        }
                        imp.dataBaju("Jepang", "Amerika", "Australia");
                    }
                    if (pilih == 2) {
                        System.out.println("Baju Lokal");
                        System.out.println("-----------");
                        no = 1;
                        for (i = 4; i < 6; i++) {
                            if (imp.id_baju[0] == 0) {
                                System.out.print("["+no+"]");
                                baj.dataBaju();
                            }
                            no++;
                        }
                        lok.dataBaju();
                    }
                    break;
                case 2:
                    System.out.println("Data Pembeli");
                    System.out.println("------------");
                    System.out.println("1. Member");
                    System.out.println("2. Non-Member");
                    System.out.println("----------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Member");
                        System.out.println("------");
                        System.out.println("1. Tambah data");
                        System.out.println("2. Update data");
                        System.out.println("--------------");
                        System.out.print("Masukkan pilihan anda: ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            System.out.println("Tambah data - Member");
                            System.out.println("--------------------");
                            System.out.print("Banyak data pembeli yang ingin diinputkan: ");
                            n = in.nextInt();
                            for (i = 0; i < n; i++) {
                                System.out.println("Data pembeli [" + (i + 1) + "]");
                                System.out.print("Masukkan id pembeli: ");
                                id2[i] = in.nextInt();
                                System.out.print("Masukkan nama: ");
                                name2[i] = in.next();
                                System.out.print("Masukkan no telp: ");
                                notelp2[i] = in.next();
                            }
                            System.out.println("\nOutput data pembeli");
                            i = 0;
                            while (name2[i] != null) {
                                mem.tambahData(id2[i],name2[i],notelp2[i]);
                                System.out.print("["+(i+1)+"]");
                                mem.display();
                                i++;
                            }
                        }

                        if (pilih == 2) {
                            System.out.println("Update Data - Member");
                            System.out.println("--------------------");
                            System.out.println("Output data pembeli");
                            i = 0;
                            while (name2[i] != null) {
                                mem.tambahData(id2[i],name2[i],notelp2[i]);
                                System.out.print("["+(i+1)+"]");
                                mem.display();
                                i++;
                            }
                            System.out.print("Masukkan nomor data yang ingin diubah: ");
                            no = in.nextInt();
                            no = no-1;
                            System.out.print("Masukkan id pembeli: ");
                            id2[no] = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            name2[no] = in.next();
                            System.out.print("Masukkan no telp: ");
                            notelp2[i] = in.next();
                            System.out.println("Mengubah data ke-"+mem.updateData(no,id2[no],name2[i],notelp2[no])+"...");
                            System.out.println("Output setelah data pembeli diupdate");
                            i = 0;
                            while (name2[i] != null) {
                                mem.tambahData(id2[i],name2[i],notelp2[i]);
                                System.out.print("["+(i+1)+"]");
                                mem.display();
                                i++;
                            }
                        }
                    }

                    if(pilih==2){
                        System.out.println("Non-Member");
                        System.out.println("----------");
                        System.out.println("1. Tambah data");
                        System.out.println("2. Update data");
                        System.out.println("---------------------");
                        System.out.print("Masukkan pilihan anda: ");
                        pilih = in.nextInt();
                        if (pilih == 1) {
                            System.out.println("Tambah data - Non Member");
                            System.out.println("------------------------");
                            System.out.print("Banyak data pembeli yang ingin diinputkan: ");
                            n = in.nextInt();
                            for (i = 0; i < n; i++) {
                                System.out.println("Data pembeli [" + (i + 1) + "]");
                                System.out.print("Masukkan id pembeli: ");
                                id2[i] = in.nextInt();
                                System.out.print("Masukkan nama: ");
                                name2[i] = in.next();
                            }
                            System.out.println("\nOutput data pembeli");
                            i = 0;
                            while (name2[i] != null) {
                                non.tambahData(id2[i],name2[i]);
                                System.out.print("["+(i+1)+"]");
                                non.display();
                                i++;
                            }
                        }

                        if (pilih == 2) {
                            System.out.println("Update Data - Non Member");
                            System.out.println("------------------------");
                            System.out.println("Output data pembeli");
                            i = 0;
                            while (name2[i] != null) {
                                non.tambahData(id2[i], name2[i]);
                                System.out.print("[" + (i + 1) + "]");
                                non.display();
                                i++;
                            }
                            System.out.print("Masukkan nomor data yang ingin diubah: ");
                            no = in.nextInt();
                            no = no - 1;
                            System.out.print("Masukkan id pembeli: ");
                            id2[no] = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            name2[no] = in.next();
                            System.out.println("Mengubah data ke-" + non.updateData(no, id2[no], name2[i]) + "...");
                            System.out.println("Output setelah data pembeli diupdate");
                            i = 0;
                            while (name2[i] != null) {
                                non.tambahData(id2[i], name2[i]);
                                System.out.print("[" + (i + 1) + "]");
                                non.display();
                                i++;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Data Kasir");
                    System.out.println("----------");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Update data");
                    System.out.println("---------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = in.nextInt();
                    if (pilih == 1) {
                        System.out.println("Tambah Data");
                        System.out.println("-----------");
                        System.out.println("Kasir 1");
                        System.out.print("Masukkan id_kasir: ");
                        kas1.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama: ");
                        kas1.nama = in.next();
                        System.out.println("Kasir 2");
                        System.out.print("Masukkan id_kasir: ");
                        kas2.id_kasir = in.nextInt();
                        System.out.print("Masukkan nama: ");
                        kas2.nama = in.next();
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                    }
                    if (pilih == 2) {
                        System.out.println("Update Data");
                        System.out.println("-----------");
                        System.out.println("Output data kasir");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                        System.out.print("Masukkan nomor data yang ingin diubah");
                        no = in.nextInt();
                        if (no == 1) {
                            System.out.println("Kasir 1");
                            System.out.print("Masukkan id_kasir: ");
                            kas1.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            kas1.nama = in.next();
                        }
                        if (no == 2) {
                            System.out.println("Kasir 2");
                            System.out.print("Masukkan id_kasir: ");
                            kas2.id_kasir = in.nextInt();
                            System.out.print("Masukkan nama: ");
                            kas2.nama = in.next();
                        }
                        System.out.println("Output data kasir setelah diupdate");
                        System.out.println("Kasir 1");
                        System.out.println(kas1.getId_kasir()+" "+kas1.getNama());
                        System.out.println("Kasir 2");
                        System.out.println(kas2.getId_kasir()+" "+kas2.getNama());
                    }
                    break;
                case 4:
                    System.out.println("Transaksi");
                    System.out.println("---------");
                    System.out.print("Masukkan id transaksi: ");
                    id4 = in.nextInt();
                    trans.setId_transaksi(id4);
                    System.out.print("Masukkan tanggal beli: ");
                    tgl = in.next();
                    trans.setTgl_beli(tgl);
                    System.out.print("Masukkan banyak baju: ");
                    jumlah4 = in.nextInt();
                    trans.setJumlah(jumlah4);
                    System.out.print("Masukkan harga: ");
                    harga4 = in.nextInt();
                    trans.setHarga(harga4);
                    System.out.print("Apakah pembeli merupakan member?(y/t): ");
                    member = in.next().charAt(0);
                    System.out.println("------------------------------------------");
                    System.out.println("Struk Pembelian Baju");
                    System.out.println("--------------------");
                    System.out.println("Id transaksi: "+trans.getId_transaksi());
                    System.out.println("Tanggal beli: "+trans.getTgl_beli());
                    System.out.println("Banyak baju: "+trans.getJumlah());
                    System.out.println("Harga: "+trans.getHarga());
                    System.out.println("---------------------");
                    System.out.println("Total harga = "+trans.totalHarga(jumlah4, harga4));
                    System.out.println("Potongan harga = -"+trans.diskon(member));
                    System.out.println("Total bayar = "+trans.jumlahBayar(member));
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak tersedia!!!");
            }
            System.out.print("Pilih menu lainnya (y/t): ");
            ulang = in.next().charAt(0);
        } while(ulang != 't');
    }
}