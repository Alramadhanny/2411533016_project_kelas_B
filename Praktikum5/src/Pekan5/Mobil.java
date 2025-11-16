package Pekan5;

public final class Mobil extends Kendaraan implements BahanBakar {
    private String jenisTransmisi;

    public Mobil(String merk, String model, int tahunProduksi, String jenisTransmisi) {
        super(merk, model, tahunProduksi);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Nyalakan Mesin: Tekan tombol start");
    }

    public String jenisBahanBakar() {
        return "Bensin";
    }

    public void fiturMobil() {
        System.out.println("Fitur Mobil: Memiliki AC dan audio premium");
    }

    public void tampilkanInfoLengkapMobil() {
        super.tampilkanInfo();
        System.out.println("Transmisi     : " + this.jenisTransmisi);
        System.out.println("Bahan Bakar   : " + this.jenisBahanBakar());
    }
}
