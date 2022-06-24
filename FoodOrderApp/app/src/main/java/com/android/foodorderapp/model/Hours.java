package com.android.foodorderapp.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class Hours {

    String Domingo;
    String Segunda;
    String Terça;
    String Quarta;
    String Quinta;
    String Sexta;
    String Sábado;

    public String getDomingo() {
        return Domingo;
    }

    public void setDomingo(String Domingo) {
        Domingo = Domingo;
    }

    public String getSegunda() {
        return Segunda;
    }

    public void setSegunda(String Segunda) {
        Segunda = Segunda;
    }

    public String getTerça() {
        return Terça;
    }

    public void setTerça(String Terça) {
        Terça = Terça;
    }

    public String getQuarta() {
        return Quarta;
    }

    public void setQuarta(String Quarta) {
        Quarta = Quarta;
    }

    public String getQuinta() {
        return Quinta;
    }

    public void setQuinta(String Quinta) {
        Quinta = Quinta;
    }

    public String getSexta() {
        return Sexta;
    }

    public void setSexta(String Sexta) {
        Sexta = Sexta;
    }

    public String getSábado() {
        return Sábado;
    }

    public void setSábado(String Sábado) {
        Sábado = Sábado;
    }

    public String getTodaysHours() {
        Calendar calendar = Calendar.getInstance();
        Date date  = calendar.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        switch (day) {
            case "Domingo":
                return this.Domingo;
            case "Segunda":
                return this.Segunda;
            case "Terça":
                return this.Terça;
            case "Quarta":
                return this.Quarta;
            case "Quinta":
                return this.Quinta;
            case "Sexta":
                return this.Sexta;
            case "Sábado":
                return this.Sábado;
            default:
                return this.Domingo;

        }
    }
}
