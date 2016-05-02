/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Administrador
 */
public class PersonaPO {
    
    private int idpersonas;
    private String nombrePrimer;
    private String nombreSegundo;
    private String apellidoPrimero;
    private String apellidoSegundo;
    private String login;
    private String pass;

    public int getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(int idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getNombrePrimer() {
        return nombrePrimer;
    }

    public void setNombrePrimer(String nombrePrimer) {
        this.nombrePrimer = nombrePrimer;
    }

    public String getNombreSegundo() {
        return nombreSegundo;
    }

    public void setNombreSegundo(String nombreSegundo) {
        this.nombreSegundo = nombreSegundo;
    }

    public String getApellidoPrimero() {
        return apellidoPrimero;
    }

    public void setApellidoPrimero(String apellidoPrimero) {
        this.apellidoPrimero = apellidoPrimero;
    }

    public String getApellidoSegundo() {
        return apellidoSegundo;
    }

    public void setApellidoSegundo(String apellidoSegundo) {
        this.apellidoSegundo = apellidoSegundo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
