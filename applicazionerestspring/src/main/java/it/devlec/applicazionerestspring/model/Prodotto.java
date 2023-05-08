package it.devlec.applicazionerestspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Prodotto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descrizione;
    private String marca;
    private Date dataDiAcquisto;
    private Date dataDiProduzione;
    private Date dataDiScadenza;
    private Float costo;
    private String valuta;
    private Boolean riciclabile;
    private Integer numeroModello;
    private Integer numeroDiVersione;
    private String codiceABarre;
    private String numeroDiSerie;

    public Prodotto(String nome, String descrizione, String marca, Date dataDiAcquisto, Date dataDiProduzione, Date dataDiScadenza, Float costo, String valuta, Boolean riciclabile, Integer numeroModello, Integer numeroDiVersione, String codiceABarre, String numeroDiSerie) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.marca = marca;
        this.dataDiAcquisto = dataDiAcquisto;
        this.dataDiProduzione = dataDiProduzione;
        this.dataDiScadenza = dataDiScadenza;
        this.costo = costo;
        this.valuta = valuta;
        this.riciclabile = riciclabile;
        this.numeroModello = numeroModello;
        this.numeroDiVersione = numeroDiVersione;
        this.codiceABarre = codiceABarre;
        this.numeroDiSerie = numeroDiSerie;
    }

    public Prodotto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getDataDiAcquisto() {
        return dataDiAcquisto;
    }

    public void setDataDiAcquisto(Date dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }

    public Date getDataDiProduzione() {
        return dataDiProduzione;
    }

    public void setDataDiProduzione(Date dataDiProduzione) {
        this.dataDiProduzione = dataDiProduzione;
    }

    public Date getDataDiScadenza() {
        return dataDiScadenza;
    }

    public void setDataDiScadenza(Date dataDiScadenza) {
        this.dataDiScadenza = dataDiScadenza;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Boolean getRiciclabile() {
        return riciclabile;
    }

    public void setRiciclabile(Boolean riciclabile) {
        this.riciclabile = riciclabile;
    }

    public Integer getNumeroModello() {
        return numeroModello;
    }

    public void setNumeroModello(Integer numeroModello) {
        this.numeroModello = numeroModello;
    }

    public Integer getNumeroDiVersione() {
        return numeroDiVersione;
    }

    public void setNumeroDiVersione(Integer numeroDiVersione) {
        this.numeroDiVersione = numeroDiVersione;
    }

    public String getCodiceABarre() {
        return codiceABarre;
    }

    public void setCodiceABarre(String codiceABarre) {
        this.codiceABarre = codiceABarre;
    }

    public String getNumeroDiSerie() {
        return numeroDiSerie;
    }

    public void setNumeroDiSerie(String numeroDiSerie) {
        this.numeroDiSerie = numeroDiSerie;
    }
}
