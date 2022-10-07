package modele;

public class Fournisseur extends Contact {
/*****STATIC VARIABLES*****/

    /*****STATIC METHODS*****/

    /*****ATTRIBUTES*****/
    private int codeScn ;

    public Fournisseur() {
        super();
    }

    /*****CONSTRUCTORS*****/

    public Fournisseur(String nom, String email, int codeScn) {
        super(nom, email);
        this.codeScn = codeScn;
    }



    /*****GETTERS AND SETTERS*****/
    public int getCodeScn() {
        return codeScn;
    }

    public void setCodeScn(int codeScn) {
        this.codeScn = codeScn;
    }
/*****OVERRIDES*****/

    /*****PUBLIC METHODS*****/
    @Override
    public String toString() {
        return "Fournisseur{" +
                "codeScn=" + codeScn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fournisseur that)) return false;
        if (!super.equals(o)) return false;

        return codeScn == that.codeScn;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + codeScn;
        return result;
    }

    public void passerCommande() {
        System.out.println("===== la comamnde a ete cree ======");
    }

    /*****PRIVATE METHODS*****/
}
