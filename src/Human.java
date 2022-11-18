public class Human {
    int yearOfBirth;
    String name;
    String town;

    public Human(int yearOfBirth, String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }

        void man() {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в" + yearOfBirth +
                    " году. Будем знакомы!");

        }

    }