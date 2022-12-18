package com.example.yemeksepeti;

import java.io.Serializable;

public class Resimler implements Serializable {
    private String resimAd;
    private int id;

    public Resimler(String resimAd, int id) {
        this.resimAd = resimAd;
        this.id = id;
    }

    public String getResimAd() {
        return resimAd;
    }

    public void setResimAd(String resimAd) {
        this.resimAd = resimAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
