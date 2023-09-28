// soal 1
public class Mahasiswa1 {
    public String nama;
    public String jurusan;
    public int nrp;
    
    // menggunakan set
    public void setnama(String namasiswa){
        nama = namasiswa;
    }
    public void setjurusan(String jurusansiswa){
        jurusan = jurusansiswa;
    }
    public void setnrp(int nrpsiswa){
        nrp = nrpsiswa;

    }
    public String inputnama(){
        return nama;
    }
    public String inputjurusan(){
        return jurusan;
    }
    public int inputnrp(){
        return nrp;
    }

    public static void main (String[] args){
        Mahasiswa1 siswa1;
        siswa1 = new Mahasiswa1();
        Mahasiswa1 siswa2 = new Mahasiswa1();
        siswa1.setnama("cita");
        siswa1.setjurusan("telkom");
        siswa1.setnrp(7206);

        siswa2.setnama("raka");
        siswa2.setjurusan("it");
        siswa2.setnrp(7306);

        System.out.println("nama: " + siswa1.inputnama());
        System.out.println("jurusan: " + siswa1.inputjurusan());
        System.out.println("nrp: " + siswa1.inputnrp());

        System.out.println();

        System.out.println("nama: " + siswa2.inputnama());
        System.out.println("jurusan: " + siswa2.inputjurusan());
        System.out.println("nrp: " + siswa2.inputnrp()); 
    }
}