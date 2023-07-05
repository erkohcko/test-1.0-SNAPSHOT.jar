public class Main {
    public static void main(String[] args) {
    Human human = new Human();
    human.firstName = "Andrey";
    human.lastName = "Petrov";
        System.out.println(human);
    }
    public static class Human {
        private String firstName;
        private String lastName;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return super.toString();
        }
        public Human() {

        }
        public Human (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


    }
}