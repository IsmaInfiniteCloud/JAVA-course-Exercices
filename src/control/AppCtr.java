package control;

import modele.Contact;
import modele.Fournisseur;
import modele.RegistreContacts;
import utils.Utilitaire;

import java.util.ArrayList;

public class AppCtr {

    public static void main(String[] args) {
        Contact contact = new Contact();
        Fournisseur fournisseur = new Fournisseur();
        RegistreContacts registreContacts= new RegistreContacts();
        Contact contact1 = new Contact("Akram","Akram@monsite.com");
        Fournisseur fournisseur1 = new Fournisseur("AnnieClairClair","Annie@yahoo.fr",1234);

        //System.out.println(contact1.toString());
        //System.out.println(contact.toString());
//        Contact contact2 = new Contact(contact1);
//        System.out.println(contact2.toString());
//
//        fournisseur.passerCommande();
        //Ajouter des objects dans la liste
        System.out.println("========ajouter des contact=======");
        registreContacts.ajouterContact(contact1);
        System.out.println("===============");
        System.out.println("========affichage des contact=======");
        registreContacts.ajouterContact(contact);
        registreContacts.afficherContact();


        String entree = Utilitaire.saisirChaine("Saisir le nom recherche");
        //rechercher un nom dans la liste
        ArrayList<Contact> resultat = registreContacts.rechercherContact(entree);

        //affichage du resultat de la recherche

        Utilitaire.afficherResultat(resultat);







    }}