package modele;


import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Objects;

public class RegistreContacts {



    /*****STATIC VARIABLES*****/

    /*****STATIC METHODS*****/

    /*****ATTRIBUTES*****/

    private ArrayList<Contact> ListeDesContact ;

    /*****CONSTRUCTORS*****/

    public RegistreContacts() {
        ListeDesContact = new ArrayList<>();
    }
    /*****GETTERS AND SETTERS*****/
    public ArrayList<Contact> getListeDesContact() {
        return ListeDesContact;
    }

    public void setListeDesContact(ArrayList<Contact> listeDesContact) {
        ListeDesContact = listeDesContact;
    }
/*****OVERRIDES*****/

    /*****PUBLIC METHODS*****/
    
    public void ajouterContact(Contact c){
        System.out.println("======= AJOUTER UN CONTACT  =======");
        ListeDesContact.add(c);
    }

    public void afficherContact(){
        System.out.println("======= LISTE DE TOUT LES CONTACTS  =======");
        for (Contact c :ListeDesContact ) {
            System.out.println(c);
        }

    }
    
    public ArrayList<Contact> rechercherContact(String mot){
        ArrayList<Contact> resultat = new ArrayList<>();
        for (Contact temp:ListeDesContact) {
            if(temp.getNom().toLowerCase().equals(mot.toLowerCase())){
            resultat.add(temp);
            }
        }
        return resultat;

    }
    
    @Override
    public String toString() {
        return "RegistreContacts{" +
                "ListeDesContact=" + ListeDesContact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistreContacts that)) return false;

        return Objects.equals(ListeDesContact, that.ListeDesContact);
    }

    @Override
    public int hashCode() {
        return ListeDesContact != null ? ListeDesContact.hashCode() : 0;
    }


/*****PRIVATE METHODS*****/
}
