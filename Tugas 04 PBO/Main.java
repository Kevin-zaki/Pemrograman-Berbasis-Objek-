
    public class Main {
        public static void main(String[] args) {
            // Membuat array atau list dari Handphone
            Handphone[] daftarHandphone = new Handphone[2];
    
            // Mengisi array dengan objek Smartphone dan FeaturePhone
            daftarHandphone[0] = new Smartphone("Redmi", "Note 10s");
            daftarHandphone[1] = new FeaturePhone("Samsung", "A23");
    
            // Menggunakan loop untuk memanggil metode secara polimorfik
            for (Handphone hp : daftarHandphone) {
                hp.nyalakan();
                hp.matikan();
                hp.KirimPesan("089636095303",  " Sedang mengerjakan tugas pbo");
                System.out.println();
            }
    
            // Mengakses metode khusus dengan casting
            for (Handphone hp : daftarHandphone) {
                if (hp instanceof Smartphone) {
                    ((Smartphone) hp).aksesInternet();
                    ((Smartphone)hp).KirimPesan("KevinZaki@univpancasil.ac.id", "Prak PBO", "Ajarin Prak PBO");
                } else if (hp instanceof FeaturePhone) {
                    ((FeaturePhone) hp).mainGameSnake();
                }
            }
        }
    }
