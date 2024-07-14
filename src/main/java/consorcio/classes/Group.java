package consorcio.classes;

import java.util.ArrayList;
import java.util.List;

public class Group {

    //Attributes
    private String typeCons;
    private List<Double> cardsAvailable;
    private Integer durationInMonths;
    private List<Card> cardsAssociated;

    private static List<Group> allGroups = new ArrayList<>();

    //Constructor

    public Group(String typeCons, Integer durationInMonths, List<Card> cardsAssociated) {
        this.typeCons = typeCons;
        this.cardsAvailable = new ArrayList<>();
        this.durationInMonths = durationInMonths;
        this.cardsAssociated = cardsAssociated;

        allGroups.add(this);
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

    public static List<Double> generateCreditCardValues(double interval, double start, double end) {
        List<Double> values = new ArrayList<>();

        for (double value = start; value <= end; value += interval) {
            values.add(value);
        }

        return values;
    }

    public static void showAllGroups() {
        for (Group group : allGroups ) {
            System.out.println("Group Type: " + group.getTypeCons());
            System.out.println("\nDuration (in months): " + group.getDurationInMonths());
            System.out.println("\nCards Available: " + group.getCardsAvailable());
            System.out.println();
        }
    }
}
