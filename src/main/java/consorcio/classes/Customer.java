package consorcio.classes;

public class Customer {

    //Attributes
    private String cpf;
    private String street;
    private String name;
    private String cel;

    //Constructor

    public Customer(String cpf, String street, String name, String cel) {
        this.cpf = cpf;
        this.street = street;
        this.name = name;
        this.cel = cel;
    }

    //Getters

    public String getCpf() { return cpf; }
    public String getStreet() {
        return street;
    }
    public String getName() {
        return name;
    }
    public String getCel() {
        return cel;
    }

    //Setters

    public void setCel(String cel) {
        this.cel = cel;
    }
    public void setStreet (String street) {
        this.street = street;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
