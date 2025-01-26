package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class JsonObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="obj_id")
    private Long id;
    private String objName;
    private String object;
    private String devclass;
    private String text;
    private String trkorr;
    private String as4text;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getDevclass() {
        return devclass;
    }

    public void setDevclass(String devclass) {
        this.devclass = devclass;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTrkorr() {
        return trkorr;
    }

    public void setTrkorr(String trkorr) {
        this.trkorr = trkorr;
    }

    public String getAs4text() {
        return as4text;
    }

    public void setAs4text(String as4text) {
        this.as4text = as4text;
    }
}
