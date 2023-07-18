//I TRIED TYPING IMPORTING package models but DID NOT WORK SO MY Review file is GREEN. No clue.
import interfaces.IReview;

public class Review implements IReview {

    private String name;

     public Review(String name){

         this.name = name;
     }

    public String review(String thoughts){
        return this.name + " left: " + thoughts;
    }

}
