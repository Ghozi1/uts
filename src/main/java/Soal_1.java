import java.sql.Date;

public class Soal_1 {
    class CustomerHotel {
        private String noKTP;
        private String nama;
        private String alamat;
        private String nomorKamar;
        private String infoTamu;
        private Date waktuCheckIn;
        private Date waktuCheckOut;
        private String informasiPembayaran;
        private String pesananMakanan;
    
        public CustomerHotel(String noKTP, String nama, String alamat, String nomorKamar, String infoTamu,
                            Date waktuCheckIn, Date waktuCheckOut, String informasiPembayaran, String pesananMakanan) {
            this.noKTP = noKTP;
            this.nama = nama;
            this.alamat = alamat;
            this.nomorKamar = nomorKamar;
            this.infoTamu = infoTamu;
            this.waktuCheckIn = waktuCheckIn;
            this.waktuCheckOut = waktuCheckOut;
            this.informasiPembayaran = informasiPembayaran;
            this.pesananMakanan = pesananMakanan;
        }
    
        // Getter and Setter methods for each attribute
    
        public String getNoKTP() {
            return noKTP;
        }
    
        public void setNoKTP(String noKTP) {
            this.noKTP = noKTP;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getAlamat() {
            return alamat;
        }
    
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
    
        public String getNomorKamar() {
            return nomorKamar;
        }
    
        public void setNomorKamar(String nomorKamar) {
            this.nomorKamar = nomorKamar;
        }
    
        public String getInfoTamu() {
            return infoTamu;
        }
    
        public void setInfoTamu(String infoTamu) {
            this.infoTamu = infoTamu;
        }
    
        public Date getWaktuCheckIn() {
            return waktuCheckIn;
        }
    
        public void setWaktuCheckIn(Date waktuCheckIn) {
            this.waktuCheckIn = waktuCheckIn;
        }
    
        public Date getWaktuCheckOut() {
            return waktuCheckOut;
        }
    
        public void setWaktuCheckOut(Date waktuCheckOut) {
            this.waktuCheckOut = waktuCheckOut;
        }
    
        public String getInformasiPembayaran() {
            return informasiPembayaran;
        }
    
        public void setInformasiPembayaran(String informasiPembayaran) {
            this.informasiPembayaran = informasiPembayaran;
        }
    
        public String getPesananMakanan() {
            return pesananMakanan;
        }
    
        public void setPesananMakanan(String pesananMakanan) {
            this.pesananMakanan = pesananMakanan;
        }
    
        public static void main(String[] args) {
            // Contoh penggunaan class CustomerHotel
            CustomerHotel customer = new CustomerHotel("1234567890", "John Doe", "Jl. Raya 123", "101",
                    "Tamu Dewasa", new Date(), new Date(), "Belum Dibayar", "Nasi Goreng");
    
            // Menampilkan informasi customer
            System.out.println("Nama: " + customer.getNama());
            System.out.println("Nomor Kamar: " + customer.getNomorKamar());
            System.out.println("Check-in: " + customer.getWaktuCheckIn());
            System.out.println("Check-out: " + customer.getWaktuCheckOut());
        }
    }
}
