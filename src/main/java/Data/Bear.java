package Data;

public class Bear {

    private String name="Bear";
    private String species="Mammal";
    private String features="They have a large body with stocky legs, long snout, small rounded ears, shaggy hair,"+"\n  big flat paws with five nonretractile claws, and short tail.";
    private String likedTheMost="I liked it the most how fluffy his fur looked like!";

    public String getInfo(){

        return "Name: Bear"+"\nSpecies: "+this.species+"\nFeatures: "+this.features+"\nWhat I liked the most:"+this.likedTheMost;

    }

}
