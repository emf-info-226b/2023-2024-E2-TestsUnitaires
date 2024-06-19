package ch.emf.e2_226b;

import ch.emf.e2_226b.wrk.Worker;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker wrk = new Worker();

        boolean estidentique1 = wrk.estISBNIdentique("978-3-16-148410-0", "978316148410-0");
        boolean estidentique2 = wrk.estISBNIdentique("978-3-16-148410-0", "978-1-4028-9462-6");

        System.out.println(estidentique1); // Affiche true
        System.out.println(estidentique2); // Affiche false

        String categorieReduction1 = wrk.retourneCategorieReduction(50.0);
        String categorieReduction2 = wrk.retourneCategorieReduction(150.0);
        String categorieReduction3 = wrk.retourneCategorieReduction(300.0);

        System.out.println(categorieReduction1); // Affiche "Pas de réduction"
        System.out.println(categorieReduction2); // Affiche "Réduction de 10%"
        System.out.println(categorieReduction3); // Affiche "Réduction de 20%"

    }

}
