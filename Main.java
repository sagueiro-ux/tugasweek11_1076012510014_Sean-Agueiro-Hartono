public class Main {
    public static void main(String[] args) {

        Kendaraan[] daftarKendaraan = new Kendaraan[4];

        // Polymorphism
        daftarKendaraan[0] = new BusKampus("Bus A", 40);
        daftarKendaraan[1] = new MobilOperasional("Mobil B", 5);
        daftarKendaraan[2] = new SepedaListrik("Sepeda C", 2);

        // Anonymous Class
        daftarKendaraan[3] = new Kendaraan("Kendaraan Khusus", 1) {
            @Override
            void bergerak() {
                System.out.println(nama + " bergerak secara unik");
            }

            @Override
            void info() {
                System.out.println("Kendaraan Anonim - Nama: " + nama + ", Kapasitas: " + kapasitas);
            }
        };

        // Loop output
        for (Kendaraan k : daftarKendaraan) {
            k.info();
            k.bergerak();
            System.out.println("-------------------");
        }
    }
}