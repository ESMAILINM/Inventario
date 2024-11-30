package com.example.inventarioti;

public class Activo {
    String ID;
    String Serial;
    String Marca;
    String Modelo;
    String Responsable;
    String TipoActivo;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipoActivo() {
        return TipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        TipoActivo = tipoActivo;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public Activo(String responsable, String marca, String modelo, String tipoActivo, String ID, String serial) {
        this.Responsable = responsable;
        this.Marca = marca;
        this.Modelo = modelo;
        this.TipoActivo = tipoActivo;
        this.ID = ID;
        this.Serial = serial;
    }

    public Activo() {
    }

}
