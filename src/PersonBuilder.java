public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Не введено имя");
        }
        else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не введена фамилия");
        }
        else {
            this.surname = surname;
        }
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 110) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        else {
            this.age = age;
        }
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null) {
            throw new IllegalStateException("Не введено имя");
        } else if (surname == null) {
            throw new IllegalStateException("Не введена фамилия");
        }
        if (age < 0 || age > 110) {
            person = new Person(name,surname);
        } else {
            person = new Person(name,surname, age);
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }


}