
package Biodata;




public class Karyawan {
    private String username;
    private String password;
    private String namaKaryawan;
    private String alamat;
    private String jenisKelamin;
    private String nomorTelepon;

    public Karyawan(String username, String password, String namaKaryawan, String alamat, String jenisKelamin, String nomorTelepon) {
        this.username = username;
        this.password = password;
        this.namaKaryawan = namaKaryawan;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan Setter untuk setiap field

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Metode lain yang mungkin diperlukan untuk fungsionalitas karyawan

    public void tampilkanInfoKaryawan() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }
}
