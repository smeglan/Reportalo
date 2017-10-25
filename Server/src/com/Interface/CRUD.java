/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface;

/**
 *
 * @author kenic
 */
public interface CRUD {
    public boolean create();
    public Modelo read(Modelo o);
    public boolean update();
    public boolean delete();
}
