package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.Pelanggan;

public class PelangganRepo {

    private static List<Pelanggan> db = new ArrayList<>();
    private static boolean isDataLoaded = false;

    public PelangganRepo() {
        if (!isDataLoaded) {
            Pelanggan p1 = new Pelanggan();
            p1.setId(UUID.randomUUID().toString());
            p1.setNama("Budi Santoso");
            p1.setEmail("budi.s@mail.com");
            p1.setTelepon("081234567890");
            db.add(p1);

            Pelanggan p2 = new Pelanggan();
            p2.setId(UUID.randomUUID().toString());
            p2.setNama("Citra Lestari");
            p2.setEmail("citra.l@mail.com");
            p2.setTelepon("082345678901");
            db.add(p2);
            
            isDataLoaded = true;
        }
    }

    public void save(Pelanggan pelanggan) {
        pelanggan.setId(UUID.randomUUID().toString()); 
        db.add(pelanggan);
        System.out.println("Data pelanggan berhasil disimpan!");
    }

    public List<Pelanggan> show() {
        return db;
    }

    public void update(Pelanggan pelanggan) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId().equals(pelanggan.getId())) {
                db.set(i, pelanggan);
                System.out.println("Data pelanggan berhasil diupdate!");
                return;
            }
        }
    }

    public void delete(String id) {
        db.removeIf(p -> p.getId().equals(id));
        System.out.println("Data pelanggan berhasil dihapus!");
    }
}