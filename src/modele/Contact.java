package modele;

import java.util.Objects;
import java.util.Scanner;

public class Contact {
/*****STATIC VARIABLES*****/

    /*****STATIC METHODS*****/

    /*****ATTRIBUTES*****/
        private String nom ;
        private String email ;
    /*****CONSTRUCTORS*****/
//constructeur avec attributs
    public Contact(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    //constructeur par default
    public Contact() {
        this.nom = "ismail";
        this.email = "isma@gmail.com";
    }

    //constructeur de copie
    public Contact(Contact contact){
        this.nom=contact.getNom();
        this.email=contact.getEmail();
    }

    /*****GETTERS AND SETTERS*****/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*****OVERRIDES*****/

    /*****PUBLIC METHODS*****/

    /*****PRIVATE METHODS*****/

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        if (!Objects.equals(nom, contact.nom)) return false;
        return Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }



}
