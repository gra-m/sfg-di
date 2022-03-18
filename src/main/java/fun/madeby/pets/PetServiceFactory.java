package fun.madeby.pets;

/**
 * Created by Gra_m on 2022 03 18
 * We are pretending that this is a third party util hence use of java
 * config to get it in..
 */


public class PetServiceFactory {

    public PetService getPetService(String petType) {

        switch(petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
