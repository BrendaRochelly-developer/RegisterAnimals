package br.com.VeterinaryClinic.RegisterAnimals;

public class Cat extends Animals
{
    public void playing(boolean animaPlaying)
    {
        if (animaPlaying == true)
        {
            System.out.println("The cat is playing with the laser!!");
        }
        else
        {
            System.out.println("shh the cat is sleeping");
        }

    }
}
