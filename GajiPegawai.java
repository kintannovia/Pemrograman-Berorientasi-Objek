import java.util.Scanner;

public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTunjangan;
    private int uangTransport;
    private int gajiPokok;
    private int totalGaji;

    public void setNama (String Nama){
        nama = Nama;
    }
    public String getNama(){
        return nama;
    }

    public void setAlamat (String Alamat){
        alamat = Alamat;
    }
    public String getAlamat(){
        return alamat;
    }

    public void setUangTransport (int UangTransport){
        uangTransport = UangTransport;
    }
    public int getUangTransport(){
        return uangTransport;
    }

    public void setUangTunjangan (int UangTunjangan){
        uangTunjangan = UangTunjangan;
    }
    public int getUangTunjangan(){
        return uangTunjangan;
    }

    public void setGajiPokok (int GajiPokok){
        gajiPokok = GajiPokok;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }

    public void setTotalGaji(int totalGaji){
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
    }
    public int getTotalGaji(){
        return totalGaji;
    }

    public int totalGaji(int uangTransport, int uangTunjangan, int gajiPokok){
        return uangTransport + uangTunjangan + gajiPokok;
    }

    public void tampilData(
        String nama,
        String alamat,
        int uangTransport,
        int uangTunjangan,
        int gajiPokok,
        int totalGaji){
        tampilData(nama, alamat, uangTransport, uangTunjangan, gajiPokok, totalGaji);   
    }

    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        Scanner input = new Scanner(System.in);

        System.out.println("### DATA GAJI KARYAWAN PT. KRAKATAU ###");
        System.out.println("---------------------------------------");

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        gaji.setNama(nama);

        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        gaji.setAlamat(alamat);

        System.out.print("Uang Transport: Rp.");
        int uangTransport = input.nextInt();
        gaji.setUangTransport(uangTransport);

        System.out.print("Uang Tunjangan: Rp.");
        int uangTunjangan = input.nextInt();
        gaji.setUangTunjangan(uangTunjangan);

        System.out.print("Gaji Pokok: Rp.");
        int gajiPokok = input.nextInt();
        gaji.setGajiPokok(gajiPokok);


        int result = gaji.totalGaji(gaji.getUangTransport(), gaji.getUangTunjangan(), gaji.getGajiPokok());

        System.out.println("Total Gaji: Rp." + result);
    }
}