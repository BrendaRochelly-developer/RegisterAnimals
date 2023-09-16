import br.com.VeterinaryClinic.RegisterAnimals.Cat;
import br.com.VeterinaryClinic.RegisterAnimals.Dog;

public class RegisterAnimals
{
    public static void main(String[] args)
    {
        Cat jolly = new Cat();

        //Informações da gata Jolly

        jolly.setAnimalName("Jolly");
        jolly.setAgeOfAnimal(2.5);
        jolly.setGenderOfAnimal("Female");
        jolly.setBreed("no race");
        jolly.setWeightAnimal(4.5);

        jolly.animalInformations();
        jolly.playing(false);

        Dog blu = new Dog();

        //Informações do cachorro

        blu.setAnimalName("Blu");
        blu.setAgeOfAnimal(6.8);
        blu.setGenderOfAnimal("Male");
        blu.setBreed("Poodle");
        blu.setWeightAnimal(6.0);

        blu.animalInformations();
        blu.makingNoise(true);

    }
}