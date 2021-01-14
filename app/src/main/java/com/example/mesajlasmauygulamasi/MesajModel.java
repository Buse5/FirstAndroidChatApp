package com.example.mesajlasmauygulamasi;

public class MesajModel {
    private String from, text;

    public MesajModel(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public MesajModel() //Boş constractor oluşturmak zorundayız yoksa uygulama patlar
    {

    }

    //mesajları alma set etme işlemleri için get set eklediik
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MesajModel{" +
                "from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
