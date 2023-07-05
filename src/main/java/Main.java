import lombok.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setFirstName("Andrey");
        human.setLastName("Petrov");
        System.out.println(human);
    }
}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Human {
    private String firstName;
    private String lastName;



}