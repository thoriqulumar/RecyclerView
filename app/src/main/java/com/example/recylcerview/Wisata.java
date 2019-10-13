package com.example.recylcerview;

public class Wisata {
    private String nama;
    private String deskripsi;
    private String photo;

    public Wisata(String nama, String deskripsi, String photo) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.photo = photo;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
