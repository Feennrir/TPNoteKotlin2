package Model

class Moto(var sideCar: Boolean = true, marque: String, anneeFabrication: Int, couleur: String) : Vehicule(marque, anneeFabrication, couleur) {

    /**Affiche les détails de la moto */
    override fun afficherDetails() {
        val sideCarString = if (sideCar) "avec side-car" else "sans side-car"
        println("Cette moto de marque $marque a été fabriquée en $anneeFabrication, est de couleur $couleur et est $sideCarString")
    }

    /**Fait klaxonner la moto */
    override fun klaxonner() = println("BIP BIP ! *la moto klaxonne*")
}