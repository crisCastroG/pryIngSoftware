package modelo;

import java.util.Date;


public class Oferta {
    private int cod_oferta;
    private String tit_oferta;
    private String desc_oferta;
    private Date fecha_termino;

    public Oferta() {
    }

    public Oferta(int cod_oferta, String tit_oferta, String desc_oferta, Date fecha_termino) {
        this.cod_oferta = cod_oferta;
        this.tit_oferta = tit_oferta;
        this.desc_oferta = desc_oferta;
        this.fecha_termino = fecha_termino;
    }

    public int getCod_oferta() {
        return cod_oferta;
    }

    public void setCod_oferta(int cod_oferta) {
        this.cod_oferta = cod_oferta;
    }

    public String getTit_oferta() {
        return tit_oferta;
    }

    public void setTit_oferta(String tit_oferta) {
        this.tit_oferta = tit_oferta;
    }

    public String getDesc_oferta() {
        return desc_oferta;
    }

    public void setDesc_oferta(String desc_oferta) {
        this.desc_oferta = desc_oferta;
    }

    public Date getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(Date fecha_termino) {
        this.fecha_termino = fecha_termino;
    }
    
    
}
