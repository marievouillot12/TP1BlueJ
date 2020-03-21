
/**
 * Lorsque l'on crée un colis, celui ci est vide donc son poids est uniquement
 * de 100g. On entre la ville ou celui ci doit être livré dès la 
 * création du colis et la personne à qui il faut le livrer.
 *
 * @author Julienne & Marie 
 * @version (20/03/2020)
 */
public class Colis
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private double poids;
    private String adresse; 
    private String destinataire;
    

    /**
     * Constructeur d'objets de classe Colis
     */
    public Colis(String adresse, String destinataire)
    {
        // initialisation des variables
        this.adresse=adresse;
        poids=0.1;
        this.destinataire=destinataire;
    }

   
    
    /**
     * @un getter pour le poids
     */
    public double getPoids()
    {
        return poids;
    }
    

    /**
     * @un getter pour l'adresse
     */
    public String getAdresse()
    {
        return adresse;
    }
    
    /**
     * @un getter pour le destinataire
     */
    public String getDestinataire()
    {
        return destinataire;
    }
    
    /**
     *Méthode pour ajouter de la charge dans le colis
     *
     */
    public double chargementColis( double charge)
    {
        poids+=charge;
        return poids;
       
    }
}
