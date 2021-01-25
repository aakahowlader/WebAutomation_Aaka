package oop.inheritnace;

public class Father extends GrandFather {

    // Variable
    public String fatherFavouriteDish="Chicken";
    public String fatherFavouriteSport="Tennis";
    public String fatherFavouriteSSN="55345894359";

    private String fatherAccountNumber;

    public Father() {

    }

    public Father(String fatherFavouriteDish) {
        this.fatherFavouriteDish = fatherFavouriteDish;
    }

    public Father(String fatherFavouriteDish, String fatherFavouriteSport, String fatherFavouriteSSN) {
        this.fatherFavouriteDish = fatherFavouriteDish;
        this.fatherFavouriteSport = fatherFavouriteSport;
        this.fatherFavouriteSSN = fatherFavouriteSSN;
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    public void swim(){
        System.out.println("Father can swim");
    }

    public void beard(){
        System.out.println("Father have long and grey beard");
    }
    public void hairColor(){
        System.out.println("Father Hair color is black and white");
    }
    public void eyes(){
        System.out.println("Father eyes color is brown");
    }
    public void goodPersonality(){
        System.out.println("Father have good personality");
    }






}
