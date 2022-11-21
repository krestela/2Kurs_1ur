public class Human {
    int yearOfBirth;
    String name;
    String town;
    String development;

    public Human(int yearOfBirth, String name, String town, String development) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.development = development;
    }

    public String toString() {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в" + yearOfBirth +
                    " году. Работаю " + development + ". Будем знакомы!";

        }

    }