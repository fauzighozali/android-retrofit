package com.example.linustorvalds.retrofitapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Linus Torvalds on 3/30/2017.
 */

public class Member {
    @SerializedName("idmember")
    private String idmember;
    @SerializedName("nama")
    private String nama;
    @SerializedName("ttl")
    private String ttl;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("notelp")
    private String notelp;

    public Member(){}

    public Member(String idmember, String nama, String ttl, String alamat, String notelp) {
        this.idmember = idmember;
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public String getIdmember() {
        return idmember;
    }

    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
}
