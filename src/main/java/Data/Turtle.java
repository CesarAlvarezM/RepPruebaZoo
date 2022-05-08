package Data;

public class Turtle {

    private String name="Turtle";
    private String species="Reptile";
    private String features="Turtles can live long lives, some can live 200 years.\n" +
            "  The turtle shell is made of keratin, which is the same material that our fingernails are made of."+"\n  Turtles have the ability to retract their heads in case of danger so that they go inside their shells.";
    private String likedTheMost="I liked it the most that he lives taking his time for everything, so calm and chill..";

    public String getInfo(){

        return "Name: "+this.name+"\nSpecies: "+this.species+"\nFeatures: "+this.features+"\nWhat I liked the most: "+this.likedTheMost;

    }

}
