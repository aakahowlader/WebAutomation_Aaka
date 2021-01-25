package oop.inheritnace;

public class Daughter extends Father  {
    public String daughterFavouriteDish="Shrimp";
    public String daughterFavouriteSport="Badminton";
    public String daughterFavouriteSSN="75345894359";

    private String daughterAccountNumber;

    public Daughter() {
    }

    public Daughter(String daughterFavouriteDish) {
        this.daughterFavouriteDish = daughterFavouriteDish;
    }

    public Daughter(String daughterFavouriteDish, String daughterFavouriteSport, String daughterFavouriteSSN) {
        this.daughterFavouriteDish = daughterFavouriteDish;
        this.daughterFavouriteSport = daughterFavouriteSport;
        this.daughterFavouriteSSN = daughterFavouriteSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void dancing(){
        System.out.println("Daughter love to do Dance");
    }

    public void singing(){
        System.out.println("Daughter love to to singing");
    }
    public void learning(){
        System.out.println("Daughter love to learning");
    }
    public void shopping(){
        System.out.println("Daughter love to shopping when she is sad");
    }
    public void flyOnTheSky(){
        System.out.println("Daughter will fly on the sky when she got QA Job");
    }



}
