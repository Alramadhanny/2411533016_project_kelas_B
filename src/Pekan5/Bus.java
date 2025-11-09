package Pekan5;

public class Bus extends Kendaraan implements TransportasiUmum {

    private String kelasBus;

    private JadwalPerjalanan jadwal;

    public Bus(String merk, String model, int tahunProduksi, String kelasBus) {
        super(merk, model, tahunProduksi);
        this.kelasBus = kelasBus;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin bus (diesel) dinyalakan dengan prosedur pemanasan awal.");
    }

    @Override
    public String jenisBahanBakar() {
        return "Solar (Diesel)";
    }

    @Override
    public int kapasitasPenumpang() {
        return 45;
    }

    public void fiturBus() {
        System.out.println("Fitur: Bus ini dilengkapi bagasi bawah yang luas dan pintu hidrolik.");
    }

    public void tampilkanInfoLengkapBus() {
        super.tampilkanInfo();
        System.out.println("Kelas Bus     : " + this.kelasBus);
        System.out.println("Bahan Bakar   : " + this.jenisBahanBakar());
        System.out.println("Kapasitas     : " + this.kapasitasPenumpang() + " penumpang");
    }

    public void setJadwal(String rute, String waktuBerangkat) {
        this.jadwal = new JadwalPerjalanan(rute, waktuBerangkat);
    }

    public void tampilkanInfoJadwalBus() {
        if (this.jadwal != null) {
            this.jadwal.tampilkanJadwal();
        } else {
            System.out.println("Jadwal belum diatur untuk bus " + this.merk + " ini.");
        }
    }

    public class JadwalPerjalanan {

        private String rute;
        private String waktuBerangkat;

        public JadwalPerjalanan(String rute, String waktuBerangkat) {
            this.rute = rute;
            this.waktuBerangkat = waktuBerangkat;
        }

        public void tampilkanJadwal() {
            System.out.println(
                "Jadwal Perjalanan: Rute " + this.rute + 
                ", Waktu Berangkat: " + this.waktuBerangkat
            );
        }
    }
} 