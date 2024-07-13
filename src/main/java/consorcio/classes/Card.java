package consorcio.classes;

public class Card {

    //Attributes

    private Double valueOfCard;
    private Integer numberOfCard;
    private Group groupAssociated;
    private Customer holderOfCard;

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
}
