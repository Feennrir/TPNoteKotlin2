package Model

class Moto(var sideCar: Boolean = true, marque: String, anneeFabrication: Int, couleur: String) : Vehicule(marque, anneeFabrication, couleur) {

    /**Affiche les détails de la moto */
    override fun afficherDetails() = println("Cette moto de marque $marque a été fabriquée en $anneeFabrication, est de couleur $couleur et est ${if (sideCar) "avec side-car" else "sans side-car"}")

    /**Fait klaxonner la moto */
    override fun klaxonner() = println("BIP BIP ! *la moto klaxonne*")
}