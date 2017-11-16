/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import com.Interface.Modelo;

/**
 *
 * @author kenic
 */
public class Reporte implements Modelo{
    String title;
    String description;
    String enterprise;
    String type;
    String[] image;
    String location;

    public Reporte(String title, String description, String enterprise, String type, String[] image, String location) {
        this.title = title;
        this.description = description;
        this.enterprise = enterprise;
        this.type = type;
        this.image = image;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Titulo, "+title+" Descripcion"+description;
    }
    
    
}
