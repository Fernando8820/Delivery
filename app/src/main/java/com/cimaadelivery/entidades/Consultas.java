package com.cimaadelivery.entidades;

import java.io.InputStream;

public class Consultas {


    private String nameServ;
    private String nameDB;
    private InputStream log;

    public Consultas(String nameServ, String nameDB, InputStream log) {
        this.nameServ = nameServ;
        this.nameDB = nameDB;
        this.log = log;
    }

    public String getNameServ() {
        return nameServ;
    }

    public void setNameServ(String nameServ) {
        this.nameServ = nameServ;
    }

    public String getNameDB() {
        return nameDB;
    }

    public void setNameDB(String nameDB) {
        this.nameDB = nameDB;
    }

    public InputStream getLog() {
        return log;
    }

    public void setLog(InputStream log) {
        this.log = log;
    }
}
