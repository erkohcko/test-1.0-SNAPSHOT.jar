import Human.Human;
import lombok.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setFirstName("Andrey");
        human.setLastName("Petrov");
        System.out.println(human);
    }
}
