package com.example.anas.foodpatrol.module;

/**
 * Created by Anas on 20/06/2017.
 */

public class Jarak {

    private String nama, jarak, gambar;

    public Jarak() {
    }

    public Jarak(String nama, String jarak, String gambar) {
        this.nama = nama;
        this.jarak = jarak;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

}