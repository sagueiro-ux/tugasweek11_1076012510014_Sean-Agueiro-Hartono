abstract class Kendaraan {
    String nama;
    int kapasitas;

    Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    abstract void bergerak();
    abstract void info();
}