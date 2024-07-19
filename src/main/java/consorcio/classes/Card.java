package consorcio.classes;

import java.util.ArrayList;
import java.util.List;

public class Card {

    //Attributes

    private static Double valueOfCard;
    private Integer numberOfCard;
    private Group groupAssociated;
    private Customer holderOfCard;

    public static List<Card> allCards = new ArrayList<>();

    //Constructor

    public Card(Double valueOfCard, Integer numberOfCard, Group groupAssociated, Customer holderOfCard) {
        this.groupAssociated = groupAssociated;
        this.numberOfCard = numberOfCard;
        this.holderOfCard = holderOfCard;
        this.valueOfCard = valueOfCard;
    }

    //Getters
    public Double getValueOfCard() {
        return valueOfCard;
    }

    public Integer getNumberOfCard() {
        return numberOfCard;
    }

    public Group getGroupAssociated() {
        return groupAssociated;
    }

    public Customer getHolderOfCard() {
        return holderOfCard;
    }

    //Setters

    public void setValueOfCard(Double valueOfCard) {
        this.valueOfCard = valueOfCard;
    }

    public void setNumberOfCard(Integer numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public void setGroupAssociated(Group groupAssociated) {
        this.groupAssociated = groupAssociated;
    }

    public void setHolderOfCard(Customer holderOfCard) {
        this.holderOfCard = holderOfCard;
    }

    public static void createCard() {

    }

    public static boolean chooseCard(Double value, List<Double> creditsAvailable) {
        try {
            Double selectedValue = value;

            if(creditsAvailable.contains(selectedValue)) {
                valueOfCard = selectedValue;
                System.out.println("Value selected: $ " + value);
                return true;
            } else {
                System.out.println("Invalid value. Please select a valid card value.");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");;
            return false;
        }
    }

}
