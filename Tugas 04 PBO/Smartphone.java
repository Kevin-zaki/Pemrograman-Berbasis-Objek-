public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void KirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Melakukan Kirim pesan ke nomor " + nomorTujuan);
        System.out.println("Pesan yang disampaikan: " + pesan);
    }

    public void KirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Melakukan Kirim pesan ke Email Tujuan: " + emailTujuan);
        System.out.println("Subjek: " + subjek);
        System.out.println("Pesan yang disampaikan: " + pesan);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}