package JavaThree;

public class Person extends Relatives{
    protected String name;
    protected Person father;
    protected Person mother;

    {
        name = null;
        father = null;
        mother = null;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Имя_%s: {Отец: %s, Мать: %s}", name, father, mother);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

}