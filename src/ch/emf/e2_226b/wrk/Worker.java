package ch.emf.e2_226b.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * Vérifie si deux numéros ISBN sont identiques.
     *
     * Les deux numéros ISBN peuvent être écrit avec ou sans la notation
     * standardisé.
     *
     * @param isbn1 Le premier numéro ISBN
     * @param isbn2 Le deuxième numéro ISBN
     * @return vrais si les deux ISBN sont identiques, sinon faux
     */
    public boolean estISBNIdentique(String isbn1, String isbn2) {
        // Supprime les éventuels tirets dans les ISBN pour une comparaison correcte
        String normalizedIsbn1 = isbn1.replace("-", "").trim();
        String normalizedIsbn2 = isbn2.replace("-", "").trim();

        // Compare les deux ISBN normalisés
        return normalizedIsbn1.equals(normalizedIsbn2);
    }

    /**
     * Retourne la catégorie de réduction basée sur le montant d'achat.
     * 
     * Les conditions sont les suivantes :<br>
     * - plus petit que 100.0 retourne "Pas de réduction"
     * - entre 100.0 inclus et 200.0 retourne "Réduction de 10%"
     * - entre 200.0 inclus et 300.0 retourne "Réduction de 15%"
     * - plus grand de 300.0 inclus retourne "Réduction de 20%"
     *
     * @param amount Le montant d'achat
     * @return La catégorie de réduction correspondante au critère ci-dessous.
     */
    public String retourneCategorieReduction(double amount) {
        if (amount < 100.0) {
            return "Pas de réduction";
        } else if (amount >= 100.0 && amount < 200.0) {
            return "Réduction de 10%";
        } else if (amount >= 200.0 && amount < 300.0) {
            return "Réduction de 15%";
        } else {
            return "Réduction de 20%";
        }
    }

}
