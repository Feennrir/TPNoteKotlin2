package Model

class Garage(private var vehicules: MutableList<Vehicule> = mutableListOf()) {

    /**
     * Ajoute un véhicule au garage
     * @param vehicule le véhicule à ajouter
     */
    fun ajouterVehicule(vehicule: Vehicule) = vehicules.add(vehicule)

    /**Affiche les détails de tous les véhicules du garage*/
    fun afficherVehicules() = vehicules.forEach { it.afficherDetails() }

    /**Fait klaxonner tous les véhicules du garage*/
    fun faireKlaxonnerTousLesVehicules() = vehicules.forEach { it.klaxonner() }
}