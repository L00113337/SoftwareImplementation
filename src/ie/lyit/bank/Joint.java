package ie.lyit.bank;

/**
 * Created by stanley on 10/15/16.
 */
public class Joint extends Account {
    protected Name name;

    public Joint() {
    }

    public Joint(Name name, Date dateOpened, Address address, Double balance, Name name1) {
        super(name, dateOpened, address, balance);
        this.name = name1;
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Joint joint = (Joint) o;

        return name != null ? name.equals(joint.name) : joint.name == null;

    }

    @Override
    public String toString() {
        return "Joint{\n" + name + "\n" + super.toString() + '}';
    }
}
