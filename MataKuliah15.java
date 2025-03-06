package kuis1;
public class MataKuliah15 {
    public static MataKuliah15 MK1;
    public static MataKuliah15 MK2;
    public static MataKuliah15 MK3;
    String kodeMk;
    String namaMk;
    int sks;
    Dosen15[] pengampuDosen15;
    
    public MataKuliah15(String kodeMk, String namaMk, int sks, Dosen15[] pengampuDosen15) {
    this.kodeMk = kodeMk;
    this.namaMk = namaMk;
    this.sks = sks;
    this.pengampuDosen15 = pengampuDosen15;

    }

    public void tampilkanInfo(){
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Nama Mata Kuliah: " + namaMk);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu: "+ pengampuDosen15.length);
        System.out.println("-------------------------------------");
    }

    public void ubahNamaMK(String namaMKBaru){
        this.namaMk = namaMKBaru;
        System.out.println("Nama Mata Kuliah Telah Diubah Menjadi: " + namaMk);
    }
    
    public void ubahSKS(int sksBaru){
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("Jumlah SKS telah diubah menjadi: " + sks);
        } else {
            System.out.println("SKS tidak bisa kurang dari 2.");
        }
    }

    public void tambahDosen(Dosen15 dosenBaru){
        Dosen15[] pengampuDosenBaru15 = new Dosen15[pengampuDosen15.length + 1];
        for (int i = 0; i < pengampuDosen15.length; i++) {
           pengampuDosenBaru15[i] = this.pengampuDosen15[i];
       }
       pengampuDosenBaru15[pengampuDosen15.length] = dosenBaru;
       this.pengampuDosen15 = pengampuDosenBaru15;
       System.out.println("Dosen telah ditambahkan ke pengampu mata kuliah: ");
    }
}
