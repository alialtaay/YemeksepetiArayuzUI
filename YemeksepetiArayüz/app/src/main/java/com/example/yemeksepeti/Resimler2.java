package com.example.yemeksepeti;

import java.io.Serializable;

public class Resimler2 implements Serializable {
    private int id ;
    private String resimad;
    private String tV1;
    private String tV2;
    private String tV3;
    private double tV5;
    private String tV4;

    public Resimler2(int id, String resimad, String tV1, String tV2, String tV3, double tV5, String tV4) {
        this.id = id;
        this.resimad = resimad;
        this.tV1 = tV1;
        this.tV2 = tV2;
        this.tV3 = tV3;
        this.tV5 = tV5;
        this.tV4 = tV4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResimad() {
        return resimad;
    }

    public void setResimad(String resimad) {
        this.resimad = resimad;
    }

    public String gettV1() {
        return tV1;
    }

    public void settV1(String tV1) {
        this.tV1 = tV1;
    }

    public String gettV2() {
        return tV2;
    }

    public void settV2(String tV2) {
        this.tV2 = tV2;
    }

    public String gettV3() {
        return tV3;
    }

    public void settV3(String tV3) {
        this.tV3 = tV3;
    }

    public double gettV5() {
        return tV5;
    }

    public void settV5(int tV5) {
        this.tV5 = tV5;
    }

    public String gettV4() {
        return tV4;
    }

    public void settV4(String tV4) {
        this.tV4 = tV4;
    }
}
