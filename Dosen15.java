package kuis1;

public class Dosen15 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen15(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo() {
        System.out.println("NIDN               : " + nidn);
        System.out.println("Nama               : " + nama);
        System.out.println("Tahun Masuk        : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Prodi              : " + prodi);
        System.out.println("-------------------------------------");
    }

    public void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
        System.out.println("Program studi telah diubah menjadi: " + prodi);
    }

    public void ubahPendidikan(String pendidikanBaru) {
        jenjangPendidikan = pendidikanBaru;
        System.out.println("Jenjang pendidikan telah diubah menjadi: " + pendidikanBaru);
    }
}

