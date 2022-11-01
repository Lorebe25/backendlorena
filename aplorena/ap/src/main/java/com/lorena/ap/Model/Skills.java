package com.lorena.ap.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkills;
    private String tituloSkills;
    private int fechaSkills;
    private String descripSkills;
    private String imagSkills;

    public Skills() {
    }

    public Skills(Long idSkills, String tituloSkills, int fechaSkills, String descripSkills, String imagSkills) {
        this.idSkills = idSkills;
        this.tituloSkills = tituloSkills;
        this.fechaSkills = fechaSkills;
        this.descripSkills = descripSkills;
        this.imagSkills = imagSkills;
    }

    public Long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(Long idSkills) {
        this.idSkills = idSkills;
    }

    public String getTituloSkills() {
        return tituloSkills;
    }

    public void setTituloSkills(String tituloSkills) {
        this.tituloSkills = tituloSkills;
    }

    public int getFechaSkills() {
        return fechaSkills;
    }

    public void setFechaSkills(int fechaSkills) {
        this.fechaSkills = fechaSkills;
    }

    public String getDescripSkills() {
        return descripSkills;
    }

    public void setDescripSkills(String descripSkills) {
        this.descripSkills = descripSkills;
    }

    public String getImagSkills() {
        return imagSkills;
    }

    public void setImagSkills(String imagSkills) {
        this.imagSkills = imagSkills;
    }
}
