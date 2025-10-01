import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<MataKuliah> krs;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.krs = new ArrayList<>();
    }

    public void tambahMatkul(MataKuliah mk) {
        krs.add(mk);
    }

    public void tampilkanKRS() {
        System.out.println("KRS Mahasiswa: " + nama + " (" + nim + ")");
        for (MataKuliah mk : krs) {
            System.out.println("- " + mk);
        }
    }
}
