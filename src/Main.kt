import Model.*

fun main() {
    val garage = Garage()

    val voiture1 = Voiture(5, "Renault", 2019, "Rouge")
    val moto1 = Moto(sideCar = true, "Yamaha", 2018, "Noir")
    val camion1 = Camion(10, "Renault", 2015, "Blanc")

    garage.ajouterVehicule(voiture1)
    garage.ajouterVehicule(moto1)
    garage.ajouterVehicule(camion1)

    garage.afficherVehicules()
    garage.faireKlaxonnerTousLesVehicules()

}