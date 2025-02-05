/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.sga.modelo;

import java.util.ArrayList;

/**
 *
 * @author man-tung
 */
public class Admin {
    private int id;
    private String name;
    private  String username;
    private  String password;
    private String date;
    private ArrayList<Turma> turmas;
    private ArrayList<Disc> discs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Disc> getDiscs() {
        return discs;
    }

    public void setDiscs(ArrayList<Disc> discs) {
        this.discs = discs;
    }
    
    
}
