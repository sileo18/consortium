package consorcio.classes;

import java.util.ArrayList;
import java.util.List;

public class Group {

    //Attributes
    private String typeCons;
    private List<Double> cardsAvailable;
    private Integer durationInMonths;
    private List<Card> cardsAssociated;

    //Constructor

    public Group(String typeCons, List<Double> cardsAvailable, Integer durationInMonths, List<Card> cardsAssociated) {
        this.typeCons = typeCons;
        this.cardsAvailable = cardsAvailable;
        this.durationInMonths = durationInMonths;
        this.cardsAssociated = cardsAssociated;
    }

    //Getters

    public String getTypeCons() {
        return typeCons;
    }

    public Integer getDurationInMonths() {
        return durationInMonths;
    }

    public List<Double> getCardsAvailable() {
        return cardsAvailable;
    }
    public List<Card> getCardsAssociated() {
        return cardsAssociated;
    }

    //Setters
    public void setTypeCons(String typeCons) {
        this.typeCons = typeCons;
    }

    public void setCardsAvailable(List<Double> cardsAvailable) {
        this.cardsAvailable = cardsAvailable;
    }

    public void setDurationInMonths(Integer durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public void setCardsAssociated(List<Card> cardsAssociated) {
        this.cardsAssociated = cardsAssociated;
    }
}
