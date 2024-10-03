package Model

class Camion(var capaciteChargement: Int, marque: String, anneeFabrication: Int, couleur: String) : Vehicule(marque, anneeFabrication, couleur) {

    /**Affiche les détails du camion*/
    override fun afficherDetails() = println("Ce camion de marque $marque a été fabriqué en $anneeFabrication, est de couleur $couleur et a une capacité de chargement de $capaciteChargement tonnes")

    /**Fait klaxonner le camion*/
    override fun klaxonner() = println("TEUT TEUT ! *le camion klaxonne*")
}