package e3_luizahackenhaarnaziazeno.e3;

import java.util.ArrayList;
import java.util.List;


    public class Evento {
    private long codigo;
    private String descricao;
    private String data;
    private double latitude;
    private double longitude;

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

   
   @Override
    public String toString() {
        return "{" +
                " codigo='" + getCodigo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", data='" + getData() + "'" +
                ", latitude='" + getLatitude() + "'" +
                ", longitude='" + getLongitude() + "'" +
                "}";
    }


}