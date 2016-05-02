/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByIdpersonas", query = "SELECT p FROM Personas p WHERE p.idpersonas = :idpersonas"),
    @NamedQuery(name = "Personas.findByNombrePrimer", query = "SELECT p FROM Personas p WHERE p.nombrePrimer = :nombrePrimer"),
    @NamedQuery(name = "Personas.findByNombreSegundo", query = "SELECT p FROM Personas p WHERE p.nombreSegundo = :nombreSegundo"),
    @NamedQuery(name = "Personas.findByApellidoPrimero", query = "SELECT p FROM Personas p WHERE p.apellidoPrimero = :apellidoPrimero"),
    @NamedQuery(name = "Personas.findByApellidoSegundo", query = "SELECT p FROM Personas p WHERE p.apellidoSegundo = :apellidoSegundo"),
    @NamedQuery(name = "Personas.findByLogin", query = "SELECT p FROM Personas p WHERE p.login = :login"),
    @NamedQuery(name = "Personas.findByPass", query = "SELECT p FROM Personas p WHERE p.pass = :pass")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersonas")
    private Integer idpersonas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrePrimer")
    private String nombrePrimer;
    @Size(max = 45)
    @Column(name = "nombreSegundo")
    private String nombreSegundo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoPrimero")
    private String apellidoPrimero;
    @Size(max = 45)
    @Column(name = "apellidoSegundo")
    private String apellidoSegundo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pass")
    private String pass;

    public Personas() {
    }

    public Personas(Integer idpersonas) {
        this.idpersonas = idpersonas;
    }

    public Personas(Integer idpersonas, String nombrePrimer, String apellidoPrimero, String login, String pass) {
        this.idpersonas = idpersonas;
        this.nombrePrimer = nombrePrimer;
        this.apellidoPrimero = apellidoPrimero;
        this.login = login;
        this.pass = pass;
    }

    public Integer getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(Integer idpersonas) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonas != null ? idpersonas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idpersonas == null && other.idpersonas != null) || (this.idpersonas != null && !this.idpersonas.equals(other.idpersonas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClass.Personas[ idpersonas=" + idpersonas + " ]";
    }
    
}
