public class PersonBuilder {

    private String name;
    private String surname;
    private int age = 0;
    private String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Не корректно указано имя!");
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Не корректно указана фамилия!");
        }
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Не корректно указан возраст!");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) throws IllegalArgumentException {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Не корректно указан адрес!");
        }
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Не корректно указано имя или фамилия!");
        }
        if (age <= 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
