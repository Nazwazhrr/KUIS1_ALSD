package kuis1;
public class MataKuliahMain15 {
    public static void main(String[] args) {
        Dosen15[] pengampuDosen15 = new Dosen15[3];
        pengampuDosen15[0] = new Dosen15("110506", "Nazwa", 1995, "S1", "SIB");
        pengampuDosen15[1] = new Dosen15("110507", "Azahra", 1996, "S2", "TI");
        pengampuDosen15[2] = new Dosen15("110508", "Audina", 1997, "S2", "MI");

        MataKuliah15 MK1 = new MataKuliah15("070406", "Daspro", 2, pengampuDosen15);
        MK1.tampilkanInfo();
        MK1.ubahNamaMK("ALSD");
        MK1.ubahSKS(3);
        MK1.tambahDosen(new Dosen15("110709", "Sasya", 1978, "S2", "TI"));
        MK1.tampilkanInfo();

        MataKuliah15 MK2 = new MataKuliah15("070407", "ALSD", 4, pengampuDosen15);
        MK2.tampilkanInfo();
        MK2.ubahNamaMK("SISOP");
        MK2.ubahSKS(5);
        MK2.tambahDosen(new Dosen15("110710", "Aisya", 1980, "S3", "SIB"));
        MK2.tampilkanInfo();
        
        MataKuliah15 MK3 = new MataKuliah15("070408", "SISOP", 5, pengampuDosen15);
        MK3.tampilkanInfo();
        MK3.ubahNamaMK("Daspro");
        MK3.ubahSKS(4);
        MK3.tambahDosen(new Dosen15("110711", "Zulfa", 1983, "S3", "MI"));
        MK3.tampilkanInfo();
        
    }
    
}
