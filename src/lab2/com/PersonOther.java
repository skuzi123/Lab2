package lab2.com;

import java.util.Objects;
import java.util.Random;

public class PersonOther {
    private String name;
    private String lastName;
    private int age;
    private String job;

    public PersonOther(String name, String lastName, String job) {
        Random random=new Random();
        this.name = name;
        this.lastName=lastName;
        this.age = random.nextInt(70);
        this.job=job;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonOther that = (PersonOther) o;

        if (age != that.age) return false;
        if (!name.equals(that.name)) return false;
        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }
}
