package Pekan5;

public class Pesawat extends Kendaraan implements TransportasiUdara, Maskapai {

    private String namaMaskapai;
    private String tipePenerbangan;
    public Pesawat(String merk, String model, int tahunProduksi, String namaMaskapai, String tipePenerbangan) {
        super(merk, model, tahunProduksi);
        this.namaMaskapai = namaMaskapai;
        this.tipePenerbangan = tipePenerbangan;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin pesawat (turbin) dinyalakan melalui prosedur kompleks oleh pilot.");
    }
    
    @Override
    public String jenisBahanBakar() {
        return "Avtur (Aviation Turbine Fuel)";
    }
    
    @Override
    public void jenisPenerbangan() {
        System.out.println("Jenis Penerbangan: " + this.tipePenerbangan);
    }

    @Override
    public String namaMaskapai() {
        return this.namaMaskapai;
    }

    public void tampilkanInfoLengkapPesawat() {
        super.tampilkanInfo();
        System.out.println("Maskapai      : " + this.namaMaskapai());
        System.out.println("Bahan Bakar   : " + this.jenisBahanBakar());
        this.jenisPenerbangan();
    }
}
