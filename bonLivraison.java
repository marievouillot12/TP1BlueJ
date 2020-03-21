
/**
 * Décrivez votre classe bonLivraison ici : 
 * Le bon de livraison comprendra le poids de son colis ainsi que le prix à 
 * payer pour l'envoyer. Le prix est calculé tel que 1 kilo coûte 10,50€
 *
 * @author (Julienne & Marie )
 * @version (20/03/2020)
 */
public class bonLivraison
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double prix;
    private double poids;
    public Colis c;

    /**
     * Constructeur d'objets de classe bonLivraison
     */
    public bonLivraison()
    {
        // initialisation des variables d'instance
        prix = 0;
        poids=0;
        
    }

    public void setColis(Colis c){
        this.c=c;
    }
    public Colis getColis() {
        return this.c;
    }
    
    /**
     * @un getter pour le prix
     */
    public double getPrix()
    {
        return prix;
    }
    
    /**
     * @un getter pour le poids
     */
    public double getPoids()
    {
        poids=this.c.getPoids();
        return poids;
    }
    
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public double calculPrix()
    {
       prix=c.getPoids()*10.5;
       return prix;
        
    }
}
