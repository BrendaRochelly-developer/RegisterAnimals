package br.com.VeterinaryClinic.RegisterAnimals;

public class Animals
{
    private String animalName;
    private String genderOfAnimal;
    private double ageOfAnimal;
    private String breed;
    private double weightAnimal;

    public void animalInformations()
    {
        System.out.println("\nName Animal: " + animalName);
        System.out.println("Age: " + ageOfAnimal);
        System.out.println("Gender: " + genderOfAnimal);
        System.out.println("Breed: " + breed);
        System.out.println("Weight Animal: " + weightAnimal);
    }

    public String getGenderOfAnimal() {
        return genderOfAnimal;
    }

    public void setGenderOfAnimal(String genderOfAnimal) {
        this.genderOfAnimal = genderOfAnimal;
    }

    public double getWeightAnimal() {
        return weightAnimal;
    }

    public void setWeightAnimal(double weightAnimal) {
        this.weightAnimal = weightAnimal;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAgeOfAnimal() {
        return ageOfAnimal;
    }

    public void setAgeOfAnimal(double ageOfAnimal) {
        this.ageOfAnimal = ageOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
