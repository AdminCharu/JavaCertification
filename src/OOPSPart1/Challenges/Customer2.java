package OOPSPart1.Challenges;

public class Customer2 {
    private String name;
    private long creditLimit;
    private String emailId;

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    //Constructor Chaining
    //1.This is calling 3rd one
    public Customer2() {
        this("Tom", "abc@gmail.com");  //


    }

    //2
    public Customer2(String name, long creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;

    }

    //3
    public Customer2(String name, String emailId) {
        this(name, 12345, emailId);


    }
}
