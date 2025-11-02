package Pekan5;

public abstract class Kendaraan {
    protected String merk;
    protected String model;
    protected int tahunProduksi;

    public Kendaraan(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return this.merk;
    }

    public String getModel() {
        return this.model;
    }

    public int getTahunProduksi() {
        return this.tahunProduksi;
    }

    public abstract void nyalakanMesin();

    public final void tampilkanInfo() {
        System.out.println("--- Informasi Kendaraan ---");
        System.out.println("Merk          : " + this.merk);
        System.out.println("Model         : " + this.model);
        System.out.println("Tahun Produksi: " + this.tahunProduksi);
    }
}
