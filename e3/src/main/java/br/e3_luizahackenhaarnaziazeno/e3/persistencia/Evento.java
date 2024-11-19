package br.e3_luizahackenhaarnaziazeno.e3.persistencia;

import jakarta.persistence.*;


@Entity
    public class Evento {
    @Id
    private long codigo;
    private String descricao;
    private String data;
    private double latitude;
    private double longitude;

    protected Evento() {
    }

    public Evento(long codigo, String descricao, String data, double latitude, double longitude) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.data = data;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getData() {
        return this.data;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


   
   @Override
    public String toString() {
        return "[" +
                " codigo='" + getCodigo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", data='" + getData() + "'" +
                ", latitude='" + getLatitude() + "'" +
                ", longitude='" + getLongitude() + "'" +
                "]";
    }


}