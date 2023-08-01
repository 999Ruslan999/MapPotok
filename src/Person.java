import java.util.HashMap;
import java.util.Map;

public class Person {

    private int id;
    private String name;
    private long payment_amount;
    private String gender;


    public Person(int id, String name, long payment_amount, String gender) {
        this.id = id;
        this.name = name;
        this.payment_amount = payment_amount;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(long payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Map{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", payment_amount=" + payment_amount +
                ", gender='" + gender + '\'' +
                '}';
    }
}
