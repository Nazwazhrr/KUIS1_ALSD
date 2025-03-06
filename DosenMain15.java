package kuis1;
public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dosen1 = new Dosen15("110506", "Nazwa", 1995, "S1", "SIB");
        dosen1.tampilkanInfo();
        dosen1.ubahProdi("TI");
        dosen1.ubahPendidikan("S2");
        dosen1.tampilkanInfo();

        Dosen15 dosen2 = new Dosen15("110507", "Azahra", 1996, "S2", "TI");
        dosen2.tampilkanInfo();
        dosen2.ubahProdi("SIB");
        dosen2.ubahPendidikan("S3");
        dosen2.tampilkanInfo();

        Dosen15 dosen3 = new Dosen15("110508", "Audina", 1997, "S2", "MI");
        dosen3.tampilkanInfo();
        dosen3.ubahProdi("TI");
        dosen3.ubahPendidikan("S3");
        dosen3.tampilkanInfo();
    }
}
