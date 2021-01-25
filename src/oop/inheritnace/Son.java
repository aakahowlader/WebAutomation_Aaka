package oop.inheritnace;

public class Son extends Father {

    public String sonFavouriteDish="Turkey";
    public String sonFavouriteSport="Cricket";
    public String sonFavouriteSSN="65345894359";

    private String sonAccountNumber;

    public Son() {
    }

    public Son(String sonFavouriteDish) {
        this.sonFavouriteDish = sonFavouriteDish;
    }

    public Son(String sonFavouriteDish, String sonFavouriteSport, String sonFavouriteSSN) {
        this.sonFavouriteDish = sonFavouriteDish;
        this.sonFavouriteSport = sonFavouriteSport;
        this.sonFavouriteSSN = sonFavouriteSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void student(){
        System.out.println("Son is a Quality Engineer Student");
    }
    public void player(){
        System.out.println("Son can play Cricket");
    }
    public void hiking(){
        System.out.println("Son love to do hiking");
    }
    public void hairStyle(){
        System.out.println("Son is interested about Covid 19 Hair style");
    }
    public void bodyBuilder(){
        System.out.println("Son love to build body");
    }





}
