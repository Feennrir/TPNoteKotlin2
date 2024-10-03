package Model

abstract class Vehicule(var marque: String, var anneeFabrication: Int, var couleur: String) {
    open fun afficherDetails() = println("Ce véhicule de marque $marque a été fabriqué en $anneeFabrication et est de couleur $couleur")
    abstract fun klaxonner()
}