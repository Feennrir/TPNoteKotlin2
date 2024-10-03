package Model

abstract class Vehicule(var marque: String, var anneeFabrication: Int, var couleur: String) {
    /**Affiche les détails du véhicule*/
    open fun afficherDetails() = println("Ce véhicule de marque $marque a été fabriqué en $anneeFabrication et est de couleur $couleur")

    /**Fait klaxonner le véhicule*/
    abstract fun klaxonner()
}