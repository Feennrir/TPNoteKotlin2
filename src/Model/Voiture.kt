package Model

class Voiture(var nombreDePortes: Int, marque: String, anneeFabrication: Int, couleur: String) : Vehicule(marque, anneeFabrication, couleur) {

    /**Affiche les détails de la voiture*/
    override fun afficherDetails() = println("Cette voiture de marque $marque a été fabriquée en $anneeFabrication, est de couleur $couleur et possède $nombreDePortes portes")

    /**Fait klaxonner la voiture*/
    override fun klaxonner() = println("BOUHHHHHHHH ! *la voiture klaxonne*")
}
