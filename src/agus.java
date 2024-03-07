import java.util.*;

class Mahasiswa  {
    String nama, nim, jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
}

class Universitas {
    String namaUniversitas;
    ArrayList<Mahasiswa> daftarMahasiswa;

    Universitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    void tambahMahasiswa(Mahasiswa siu) {
        daftarMahasiswa.add(siu);
    }

    void tampilkanDataMahasiswa() {
        System.out.println("Universitas " + namaUniversitas);
        for (Mahasiswa siu : daftarMahasiswa) {
            System.out.print("Nama :\n" + siu.nama +  ", NIM : " + siu.nim + ",\n Jurusan :\n " + siu.jurusan);
        }
    }
}

public class agus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Universitas umm = new Universitas(" Muhammadiyah Malang");
        int pilihan;
        do {
            System.out.println("Menu :");
            System.out.println("1.Tambah Data Mahasiswa");
            System.out.println("2.Tampilkan Data Mahasiwa");
            System.out.println("3.Keluar");
            System.out.println("Pilihan Anda : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa : ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM mahasiswa : ");
                    String nim = sc.nextLine();
                    while (nim.length() != 15) {
                        System.out.println("NIM harus 15 digit!!!!!");
                        System.out.println("Masukkan NIM mahasiswa : ");
                        nim = sc.nextLine();
                    }
                    System.out.print("Masukkan jurusan mahasiswa : ");
                    String jurusan = sc.nextLine();
                    umm.tambahMahasiswa(new Mahasiswa(nama, nim, jurusan));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    umm.tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Masukan Data Yang Bener Lah!!");
            }
        } while (pilihan != 3);
        sc.close();
    }
}