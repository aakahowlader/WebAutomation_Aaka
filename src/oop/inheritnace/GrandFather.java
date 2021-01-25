package oop.inheritnace;

public class GrandFather {

    // Variable
    public String grandFatherFavouriteDish="Fish";
    public String grandFatherFavouriteSport="Soccer";
    public String grandFatherFavouriteSSN="45345894359";
    private String grandFatherAccountNumber;

    public GrandFather() {
    }

    public GrandFather(String grandFatherFavouriteDish) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
    }

    public GrandFather(String grandFatherFavouriteDish, String grandFatherFavouriteSport, String grandFatherFavouriteSSN) {
        this.grandFatherFavouriteDish = grandFatherFavouriteDish;
        this.grandFatherFavouriteSport = grandFatherFavouriteSport;
        this.grandFatherFavouriteSSN = grandFatherFavouriteSSN;
    }

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    public void fishing(){
        System.out.println("Grand Father love to do fishing");
    }

    public void height(){
        System.out.println("Grand Father height is 6.2");
    }
    public void jump(){
        System.out.println("Grand Father can jump");
    }
    public void playGame(){
        System.out.println("Grand Father play Soccer");
    }
    public void bloodGroup(){
        System.out.println("Grand Father blood group is A-");
    }
    public void tellStories(){
        System.out.println("Grand Father love to tell Stories");
    }
    public void loveAnimals(){
        System.out.println("Grand Father love Animals");
    }


}
