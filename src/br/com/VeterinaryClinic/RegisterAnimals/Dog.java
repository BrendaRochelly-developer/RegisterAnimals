package br.com.VeterinaryClinic.RegisterAnimals;

public class Dog extends Animals
{
    public void makingNoise(boolean dogMadeNoise)
    {
        if (dogMadeNoise == true)
        {
            System.out.println("au au au!! the dog is playing!!");
        }
        else
        {
            System.out.println("shh the dog is sleeping");
        }

    }
}
