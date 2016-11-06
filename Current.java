package ie.lyit.bank;

/**
 * Created by stanley on 31/10/16.
 */
public class Current extends Account{

    protected Double overdraft;

    public Current() {
    }

    public Current(Name name, Date dateOpened, Address address, Double balance, Double overdraft) {
        super(name, dateOpened, address, balance);
        this.overdraft = overdraft;
    }

    public Double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Double overdraft) {
        this.overdraft = overdraft;
    }

    public boolean isOverdraft() {
        if(balance - overdraft < 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Current current = (Current) o;

        return overdraft != null ? overdraft.equals(current.overdraft) : current.overdraft == null;

    }

    @Override
    public String toString() {
        return "Current{\n" + super.toString() + "\n" +
                "overdraft=" + overdraft +
                "}\n\n";
    }

}