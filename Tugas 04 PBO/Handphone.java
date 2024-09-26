
    public class Handphone {
        protected String merk;
        protected String model;
    
        public Handphone(String merk, String model) {
            this.merk = merk;
            this.model = model;
        }
    
        public void nyalakan() {
            System.out.println("Handphone dinyalakan.");
        }
    
        public void matikan() {
            System.out.println("Handphone dimatikan.");
        }
    
        public void KirimPesan(String nomorTujuan, String pesan) {
            System.out.println("Kirim pesan ke nomor: " + nomorTujuan);
            System.out.println("Pesan yang disampaikan: " + pesan);
        }
    
        public void KirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan){
            System.out.println("Kirim Pesan ke no pertama: " + nomorTujuan1);
            System.out.println("Kirim Pesan ke no pertama: " + nomorTujuan2);
            System.out.println("Kirim Pesan: " + pesan);
        }
    
        public void KirimPesan(String[] daftarNomor, String pesan){
            System.out.println("Daftar Nomor: " + daftarNomor);
            System.out.println("Pesan: " + pesan);
        }
    }

