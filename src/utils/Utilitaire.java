package utils;

import modele.Contact;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Utilitaire {

/*****STATIC VARIABLES*****/

    /*****STATIC METHODS*****/
public static void afficherResultat(ArrayList <Contact>trouve){
    System.out.println("=============LISTE DES CONATCT TROUVES===============");
    for (Contact temp:trouve) {
        System.out.println(temp);
    }

}
    public static String saisirChaine (String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    /*****ATTRIBUTES*****/

    /*****CONSTRUCTORS*****/

    /*****GETTERS AND SETTERS*****/

    /*****OVERRIDES*****/

    /*****PUBLIC METHODS*****/

    /*****PRIVATE METHODS*****/
}
