package repository;

import java.util.HashMap;
import java.util.Map;

public class ProdiTbl {
    private Map<String, String> prodiData = new HashMap<>();
    private Database database;

    public ProdiTbl(Database database) {
        this.database = database;
    }

    // Metode untuk menambahkan data prodi
    public void create(String idProdi, String namaProdi) {
        prodiData.put(idProdi, namaProdi);
        database.commit();
    }

    // Metode untuk mencari data prodi berdasarkan ID
    public String getProdiById(String idProdi) {
        return prodiData.get(idProdi);
    }

    // Metode untuk memeriksa keberadaan prodi dalam database prodi
    public boolean prodiExists(String idProdi) {
        return prodiData.containsKey(idProdi);
    }
}
